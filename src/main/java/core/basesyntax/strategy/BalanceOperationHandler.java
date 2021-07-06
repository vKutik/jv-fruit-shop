package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.dto.Transaction;
import core.basesyntax.model.Fruit;

public class BalanceOperationHandler implements OperationHandler {

    @Override
    public int apply(Transaction transaction) {
        int newQuantity = transaction.getQuality();
        Fruit fruit = new Fruit(transaction.getFruitName());
        Storage.data.put(transaction.getFruitName(), newQuantity);
        return newQuantity;
    }
}