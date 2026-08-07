package androidx.credentials.exceptions.restorecredential;

import androidx.credentials.exceptions.CreateCredentialException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import e6.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/credentials/exceptions/restorecredential/CreateRestoreCredentialDomException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Le6/e;", "domError", "", "errorMessage", "<init>", "(Le6/e;Ljava/lang/CharSequence;)V", DateTokenConverter.CONVERTER_KEY, "Le6/e;", "getDomError", "()Le6/e;", "e", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CreateRestoreCredentialDomException extends CreateCredentialException {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e domError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialDomException(e domError, CharSequence errorMessage) {
        super("androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/" + domError.getType(), errorMessage);
        s.k(domError, "domError");
        s.k(errorMessage, "errorMessage");
        this.domError = domError;
    }
}
