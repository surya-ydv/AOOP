package task_10;

class TransactionThread extends Thread {
    private Account account;
    private double amount;
    private boolean isDeposit;

    public TransactionThread(Account account, double amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}