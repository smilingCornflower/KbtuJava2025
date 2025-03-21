package Lab7.EmployeeDao.com.example.dao;

public class EmployeeDAOFactory {
    public EmployeeDAO createEmployeeDAO () {
        return new EmployeeDAOMemoryImpl();
    }
}
