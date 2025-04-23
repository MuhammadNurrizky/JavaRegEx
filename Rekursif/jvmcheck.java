class JVMMemoryCheck {
    static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: " + runtime.totalMemory() / 1024 / 1024 + " MB");
        System.out.println("Free Memory: " + runtime.freeMemory() / 1024 / 1024 + " MB");
        System.out.println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + " MB");
        System.out.println("Max Memory: " + runtime.maxMemory() / 1024 / 1024 + " MB");
    }
}
