package br.com.isidrocorp.eventdash.model;

import javax.persistence.*;

@Entity
@Table(name="itmn_equipamento")
public class Equipamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id_equip")
	private int Id;
	
	@Column(name="hostname", length=50, nullable=false)
	private String hostname;
	
	@Column(name="ipaddr", length=15, nullable=false)
	private String ipaddr;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIpaddr() {
		return ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}
	
}
