package custom;

import com.example.layeredarchitecture.model.CustomerDTO;
import dao.CrudDAO;

import java.sql.*;
import java.util.List;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {


}
