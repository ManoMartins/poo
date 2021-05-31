package br.com.poolSchedule.dao;

import br.com.poolSchedule.factory.ConnectionFactory;
import br.com.poolSchedule.model.PoolSchedule;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PoolScheduleDAO {
    public void save(PoolSchedule poolSchedule) {
        String sql = "INSERT INTO pool_schedule (name, block, ap, created_at) VALUES (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionFactory.createConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, poolSchedule.getName());
            ps.setInt(2, poolSchedule.getBlock());
            ps.setInt(3, poolSchedule.getAp());
            ps.setDate(4, new Date(poolSchedule.getCreated_at().getTime()));

            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public List<PoolSchedule> getPoolSchedule() {
        String sql = "SELECT * FROM pool_schedule";

        List<PoolSchedule> poolSchedules = new ArrayList<PoolSchedule>();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.createConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                PoolSchedule poolSchedule = new PoolSchedule();

                poolSchedule.setId(rs.getInt("id"));
                poolSchedule.setName(rs.getString("name"));
                poolSchedule.setBlock(rs.getInt("block"));
                poolSchedule.setAp(rs.getInt("ap"));
                poolSchedule.setCreated_at(rs.getDate("created_at"));

                poolSchedules.add(poolSchedule);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return poolSchedules;
    }

    public void update(PoolSchedule poolSchedule) {
        String sql = "UPDATE pool_schedule SET name = ?, block = ?, ap = ?, created_at = ?" + "WHERE id = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionFactory.createConnection();

            ps = conn.prepareStatement(sql);

            ps.setString(1, poolSchedule.getName());
            ps.setInt(2, poolSchedule.getBlock());
            ps.setInt(3, poolSchedule.getAp());
            ps.setDate(4, new Date(poolSchedule.getCreated_at().getTime()));

            ps.setInt(5, poolSchedule.getId());

            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }

                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public void deleteByID(int id) {
        String sql = "DELETE FROM pool_schedule WHERE id = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionFactory.createConnection();

            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
