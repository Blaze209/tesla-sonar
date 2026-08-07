package z30;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lz30/d;", "", "Lz30/d$b;", Action.KEY_ATTRIBUTE, "", "reset", "Ljn0/h0;", "a", "(Lz30/d$b;Z)V", "Lio0/b;", "b", "(Lz30/d$b;)Lio0/b;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface d {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(d dVar, b bVar, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            dVar.a(bVar, z11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lz30/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Loading", "Checkout", "LinkSignup", "ConfirmButtonClicked", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        Loading,
        Checkout,
        LinkSignup,
        ConfirmButtonClicked;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    void a(b key, boolean reset);

    io0.b b(b key);
}
