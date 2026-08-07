package po0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0081@\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0088\u0001\u0002\u0092\u0001\u00020\u0001¨\u0006\u0006"}, d2 = {"Lpo0/j;", "", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@vn0.b
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: po0.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lpo0/j$a;", "", "<init>", "()V", "", "indexOfNextUnparsed", "Lpo0/j;", "b", "(I)Ljava/lang/Object;", "position", "Lkotlin/Function0;", "", "message", "a", "(ILwn0/a;)Ljava/lang/Object;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(int position, wn0.a<String> message) {
            p013kotlin.jvm.internal.s.k(message, "message");
            return j.b(new i(position, message));
        }

        public final Object b(int indexOfNextUnparsed) {
            return j.b(Integer.valueOf(indexOfNextUnparsed));
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object b(Object obj) {
        return obj;
    }
}
