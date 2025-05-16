public class ManajemenStok {
    public static void main(String[]args){
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.tambahDataAwal();
        UserInterface ui = new UserInterface(inventoryManager);
        ui.mulai();
    }
}