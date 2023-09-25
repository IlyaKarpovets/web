package testIlya;

import javax.persistence.*;


@Entity
@Table(name = "testilya")
public class Object {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
 private Integer id;
 
 @Column(name = "fio")
 private String fio;
 
 @Column(name = "address")
 private String address;
 
 public test() {
  super();
 }
 
 public Object(String fio, String address) {
  super();
  this.fio = fio;
  this.address = address;
 }
 
 public String getFio() {
  return fio;
 }
 
 public void setFio(String fio) {
  this.fio = fio;
 }
 
 public String getAddress() {
  return address;
 }
 
 public void setAddress(String address) {
  this.address = address;
 }
}