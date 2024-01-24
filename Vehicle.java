  class Vehicle implements Two_whee,Four_whee {
      @Override
      public void cycle(char colours, int model) {
          colours = 'f';
          model = 2;
      }

      @Override
      public void scooter(char colours, int year, int cc) {
          colours = '5';
          year = 2;
          cc = 125;
      }

      @Override
      public void bike(char colours, int light, boolean scratch, char brand) {
          colours = 6;
          light = 2;
          scratch = false;
          brand = 4;
      }

      @Override
      public void car(int seat, boolean horn, char type) {
          seat = 4;
          horn = true;
          type = 't';
          System.out.println(+seat +  +type);
      }
      @Override
      public void bus(int rear, int cc, char brand, char type) {
          rear = 3;
          cc = 1000;
          brand = 'j';
          type = 'a';
          System.out.println(rear + cc + brand + type);
      }

      @Override
      public void truck(int year, boolean used, char brand, int customer) {
          year = 2011;
          used = false;
          brand = 'y';
          customer = 500;
          System.out.println("year" + year + "used" + used + "brand" + brand + "customer" + customer);
      }

      class Myvehi {
          public static void main(String ar[]) {
              Vehicle v = new Vehicle();

          }
      }
  }
