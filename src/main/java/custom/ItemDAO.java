package custom;

import com.example.layeredarchitecture.model.ItemDTO;
import dao.CrudDAO;

import java.sql.*;
import java.util.List;

public interface ItemDAO extends CrudDAO<ItemDTO> {
}

