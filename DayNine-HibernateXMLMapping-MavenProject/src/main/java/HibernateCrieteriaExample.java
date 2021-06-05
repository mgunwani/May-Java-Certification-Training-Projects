import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bhawnagunwani.models.Brand;
import com.bhawnagunwani.models.Category;
import com.bhawnagunwani.models.Product;
import com.bhawnagunwani.utils.HibernateUtils;

public class HibernateCrieteriaExample {

	public static void main(String[] args) {

		Transaction transaction = null;

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			/*
			 * CriteriaBuilder builder = session.getCriteriaBuilder();
			 * CriteriaQuery<Product> query = builder.createQuery(Product.class);
			 * Root<Product> root = query.from(Product.class); query.select(root);
			 * Query<Product> q = session.createQuery(query); List<Product> products =
			 * q.getResultList(); for (Product product : products) {
			 * System.out.println(product); }
			 */

			/*
			 * // Select * from Product where id = 1; CriteriaBuilder builder =
			 * session.getCriteriaBuilder(); CriteriaQuery<Product> query =
			 * builder.createQuery(Product.class); Root<Product> root =
			 * query.from(Product.class);
			 * query.select(root).where(builder.equal(root.get("id"), 1)); Query<Product> q
			 * = session.createQuery(query); Product product = q.getSingleResult();
			 * System.out.println(product);
			 */

			/*
			 * // Select name from Product; CriteriaBuilder builder =
			 * session.getCriteriaBuilder(); CriteriaQuery<Product> query =
			 * builder.createQuery(Product.class); Root<Product> root =
			 * query.from(Product.class); query.select(root.get("name")); Query<Product> q =
			 * session.createQuery(query); List<Product> products = q.getResultList(); for
			 * (Product product : products) { System.out.println(product); }
			 */

			// Using FROM and JOIN
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
			Root<Product> productRoot = criteriaQuery.from(Product.class);
			Root<Brand> brandRoot = criteriaQuery.from(Brand.class);
			criteriaQuery.multiselect(productRoot, brandRoot);
			criteriaQuery.where(builder.equal(productRoot.get("brand"), brandRoot.get("id")));

			Query<Object[]> query = session.createQuery(criteriaQuery);
			List<Object[]> list = query.getResultList();
			for (Object[] objects : list) {
				Product employee = (Product) objects[0];
				Brand department = (Brand) objects[1];
				System.out.println("Product NAME=" + employee.getName() + "\t Brand NAME=" + department.getName());
			}

			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}

	}

}
