package custom;

import com.example.layeredarchitecture.model.OrderDTO;
import dao.CrudDAO;

import java.sql.SQLException;

    public interface OrderDAO extends CrudDAO<OrderDTO> {
    }

