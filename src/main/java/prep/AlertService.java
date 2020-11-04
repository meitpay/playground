package prep;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class AlertService  {
    private final MapAlertDAO storage = new MapAlertDAO();
    AlertDAO alertDAO;

    public AlertService(AlertDAO alertDAO) {
        this.alertDAO = alertDAO;
    }

    public UUID raiseAlert() {
        return this.alertDAO.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.alertDAO.getAlert(id);
    }
}

class MapAlertDAO implements AlertDAO{
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}

abstract interface AlertDAO {
    public UUID addAlert(Date time);
    public Date getAlert(UUID id);
}