package d6;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\t"}, d2 = {"Ld6/e;", "Ld6/c;", "Landroid/os/Bundle;", "data", "<init>", "(Landroid/os/Bundle;)V", "()V", DateTokenConverter.CONVERTER_KEY, "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends c {
    private e(Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
    }

    public e() {
        this(new Bundle());
    }
}
