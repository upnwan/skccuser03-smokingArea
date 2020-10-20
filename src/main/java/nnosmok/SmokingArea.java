package nnosmok;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="SmokingArea_table")
public class SmokingArea {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long smokingAreaId;
    private Long latitude;
    private Long longitude;
    private String smokingAreaName;

    @PostPersist
    public void onPostPersist(){
        RegisteredSmokingArea registeredSmokingArea = new RegisteredSmokingArea();
        BeanUtils.copyProperties(this, registeredSmokingArea);
        registeredSmokingArea.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getSmokingAreaId() {
        return smokingAreaId;
    }

    public void setSmokingAreaId(Long smokingAreaId) {
        this.smokingAreaId = smokingAreaId;
    }
    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }
    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
    public String getSmokingAreaName() {
        return smokingAreaName;
    }

    public void setSmokingAreaName(String smokingAreaName) {
        this.smokingAreaName = smokingAreaName;
    }




}
