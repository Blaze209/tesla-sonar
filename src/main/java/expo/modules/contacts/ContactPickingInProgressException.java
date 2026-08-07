package expo.modules.contacts;

import expo.modules.kotlin.exception.CodedException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/ContactPickingInProgressException;", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactPickingInProgressException extends CodedException {
    public ContactPickingInProgressException() {
        super("Different contact picking in progress. Await other contact picking first.", null, 2, null);
    }
}
