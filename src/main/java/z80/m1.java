package z80;

import com.google.android.gms.common.Scopes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.annotation.Annotation;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lz80/m1;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "b", "Text", "Ascii", "Number", "Phone", "Uri", "Email", "Password", "NumberPassword", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public enum m1 {
    Text,
    Ascii,
    Number,
    Phone,
    Uri,
    Email,
    Password,
    NumberPassword;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f127625c);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127625c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ro0.d<Object> invoke() {
            return vo0.a0.a("com.stripe.android.ui.core.elements.KeyboardType", m1.values(), new String[]{"text", "ascii", InquiryField.FloatField.TYPE2, "phone", "uri", Scopes.EMAIL, "password", "number_password"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* JADX INFO: renamed from: z80.m1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/m1$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/m1;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ ro0.d a() {
            return (ro0.d) m1.$cachedSerializer$delegate.getValue();
        }

        public final ro0.d<m1> serializer() {
            return a();
        }

        private Companion() {
        }
    }

    public static EnumEntries<m1> getEntries() {
        return $ENTRIES;
    }
}
