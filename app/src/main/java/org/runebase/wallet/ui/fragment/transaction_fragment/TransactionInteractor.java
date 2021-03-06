package org.runebase.wallet.ui.fragment.transaction_fragment;

import org.runebase.wallet.model.gson.history.History;

public interface TransactionInteractor {
    History getHistory(int position);

    String getFullDate(long l);

    String getUnconfirmedDate();
}
