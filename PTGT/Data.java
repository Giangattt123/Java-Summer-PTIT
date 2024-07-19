/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.demo1;

import java.util.ArrayList;
import java.util.List;

public class Data {
   public Data() {
   }
   public List<PTGT> getData() {
      List<PTGT> list = new ArrayList();
      Oto o = new Oto("Yaris", "10/2020", 30000.0, 4, 1.5);
      o.setMa();
      list.add(o);
      o = new Oto("Vios", "05/2018", 18000.0, 4, 1.6);
      o.setMa();
      list.add(o);
      o = new Oto("Innova", "06/2020", 25000.0, 7, 1.8);
      o.setMa();
      list.add(o);
      o = new Oto("Lexus RX 450h", "06/2020", 45000.0, 7, 3.5);
      o.setMa();
      list.add(o);
      XeTai t = new XeTai("Ranger", "11/2023", 31000.0, 3.5, true);
      t.setMa();
      list.add(t);
      t = new XeTai("Suzuki Carry Truck", "05/2018", 20000.0, 5.0, false);
      t.setMa();
      list.add(t);
      t = new XeTai("Hyundai HD99", "05/2020", 12000.0, 6.5, true);
      t.setMa();
      list.add(t);
      t = new XeTai("Hyundai HD700", "05/2018", 20000.0, 7.0, false);
      t.setMa();
      list.add(t);
      return list;
   }
}
/*
// Ô tô
YA-001 Yaris 10/2020 4 24000
VI-002 Vios 05/2018 4 14400
IN-003 Innova 06/2020 7 20000
LE-004 Lexus RX 450h 06/2020 7 36000
// Xe tải 
T-005 Ranger 11/2023 3.5 37510
*/