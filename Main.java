import java.util.*;

// 🔒 Encapsulation
class Food {
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // 🎭 Polymorphism
    public double calculatePrice() {
        return price;
    }
}

// 🧬 Inheritance
class Burger extends Food {
    public Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice() + 20; // extra charge
    }
}

class Pizza extends Food {
    public Pizza(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice() + 50; // extra charge
    }
}

// 🧩 Abstraction
abstract class OrderSystem {
    abstract void addItem(Food food);
    abstract void showOrder();
    abstract double calculateTotal();
}

// Order Implementation
class FoodOrder extends OrderSystem {
    private List<Food> items = new ArrayList<>();

    @Override
    void addItem(Food food) {
        items.add(food);
    }

    @Override
    void showOrder() {
        System.out.println("\n===== Your Order =====");
        for (Food f : items) {
            System.out.println(f.getName() + " - " + f.calculatePrice() + " Tk");
        }
    }

    @Override
    double calculateTotal() {
        double total = 0;
        for (Food f : items) {
            total += f.calculatePrice();
        }

        // Discount
        if (total > 500) {
            System.out.println("🎉 Discount Applied: 10%");
            total = total * 0.9;
        }

        return total;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FoodOrder order = new FoodOrder();

        int choice;

        do {
            System.out.println("\n🍔 Food Ordering System");
            System.out.println("1. Add Burger");
            System.out.println("2. Add Pizza");
            System.out.println("3. Show Order");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Burger Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Base Price: ");
                double price = sc.nextDouble();

                order.addItem(new Burger(name, price));
                System.out.println("✅ Burger Added!");
            }

            else if (choice == 2) {
                System.out.print("Enter Pizza Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Base Price: ");
                double price = sc.nextDouble();

                order.addItem(new Pizza(name, price));
                System.out.println("✅ Pizza Added!");
            }

            else if (choice == 3) {
                order.showOrder();
            }

            else if (choice == 4) {
                order.showOrder();
                double total = order.calculateTotal();
                System.out.println("💰 Total Bill: " + total + " Tk");
                System.out.println("✅ Order Confirmed!");
            }

        } while (choice != 5);

        System.out.println("👋 Thank you!");
        sc.close();
    }
}import java.util.*;

// 🔒 Encapsulation
class Food {
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // 🎭 Polymorphism
    public double calculatePrice() {
        return price;
    }
}

// 🧬 Inheritance
class Burger extends Food {
    public Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice() + 20; // extra charge
    }
}

class Pizza extends Food {
    public Pizza(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice() + 50; // extra charge
    }
}

// 🧩 Abstraction
abstract class OrderSystem {
    abstract void addItem(Food food);
    abstract void showOrder();
    abstract double calculateTotal();
}

// Order Implementation
class FoodOrder extends OrderSystem {
    private List<Food> items = new ArrayList<>();

    @Override
    void addItem(Food food) {
        items.add(food);
    }

    @Override
    void showOrder() {
        System.out.println("\n===== Your Order =====");
        for (Food f : items) {
            System.out.println(f.getName() + " - " + f.calculatePrice() + " Tk");
        }
    }

    @Override
    double calculateTotal() {
        double total = 0;
        for (Food f : items) {
            total += f.calculatePrice();
        }

        // Discount
        if (total > 500) {
            System.out.println("🎉 Discount Applied: 10%");
            total = total * 0.9;
        }

        return total;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FoodOrder order = new FoodOrder();

        int choice;

        do {
            System.out.println("\n🍔 Food Ordering System");
            System.out.println("1. Add Burger");
            System.out.println("2. Add Pizza");
            System.out.println("3. Show Order");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Burger Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Base Price: ");
                double price = sc.nextDouble();

                order.addItem(new Burger(name, price));
                System.out.println("✅ Burger Added!");
            }

            else if (choice == 2) {
                System.out.print("Enter Pizza Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Base Price: ");
                double price = sc.nextDouble();

                order.addItem(new Pizza(name, price));
                System.out.println("✅ Pizza Added!");
            }

            else if (choice == 3) {
                order.showOrder();
            }

            else if (choice == 4) {
                order.showOrder();
                double total = order.calculateTotal();
                System.out.println("💰 Total Bill: " + total + " Tk");
                System.out.println("✅ Order Confirmed!");
            }

        } while (choice != 5);

        System.out.println("👋 Thank you!");
        sc.close();
    }
}