package vip.qianbai.cloud.service.user.service;
import lombok.Getter;
import lombok.Setter;


/** 
 * TODO 该类的作用<br/>
 * @date    2017年2月21日 <br/> 
 * @author   陈小峰
 * @since    JDK 7
 */
@Setter
@Getter
public class UserHystrixBean {

	String name ;
	public UserHystrixBean(String name){
		this.name = name;
	}
}
