package cn.amos.boot.model.dto;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaoBaoLocationDTO implements Serializable {
    private static final long serialVersionUID = -3582171569909582185L;
    /**
     * 国家
     */
    private String country;
    @JsonProperty("country_id")
    private String countryId;
    /**
     * 地区
     */
    private String area;
    @JsonProperty("area_id")
    private String areaId;
    /**
     * 省份
     */
    private String region;
    @JsonProperty("region_id")
    private String regionId;
    /**
     * 城市
     */
    private String city;
    @JsonProperty("city_id")
    private String cityId;
    /**
     * 假的·省份·NULL
     */
    private String county;
    @JsonProperty("county_id")
    private String countyId;
    /**
     * 运营商
     */
    private String isp;
    @JsonProperty("isp_id")
    private String ispId;
    /**
     * ip地址
     */
    private String ip;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}



