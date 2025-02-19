class Account {
    constructor(accNo, holderName, balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    getBalance() {
        return this.balance;
    }

    deposit(amount) {
        this.balance += amount;
        console.log(`${amount} is credited to the Account No. ******${this.accNo.slice(6)}.Avl Bal: ${this.balance}`);
    }

    withdraw(amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            console.log(`${amount} is debited from the Account No. ******${this.accNo.slice(6)}.Avl Bal: ${this.balance}`);
        }
        else {
            console.log('Insufficient Balance');
        }
    }
}

const acc1 = new Account('1902543556',"Vishal Kumar",90000);
acc1.deposit(1000);
acc1.withdraw(80000);

