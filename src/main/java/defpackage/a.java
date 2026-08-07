package defpackage;

import java.lang.annotation.Annotation;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import ro0.d;
import ro0.p;
import vo0.a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"La;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "b", "Left", "Center", "Right", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public enum a {
    Left,
    Center,
    Right;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<d<Object>> $cachedSerializer$delegate = m.a(jn0.p.PUBLICATION, C0000a.f6c);

    /* JADX INFO: renamed from: a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C0000a extends u implements wn0.a<d<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0000a f6c = new C0000a();

        C0000a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d<Object> invoke() {
            return a0.a("Alignment", a.values(), new String[]{"left", "center", "right"}, new Annotation[][]{null, null, null}, null);
        }
    }

    /* JADX INFO: renamed from: a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La$b;", "", "<init>", "()V", "Lro0/d;", "La;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ d a() {
            return (d) a.$cachedSerializer$delegate.getValue();
        }

        public final d<a> serializer() {
            return a();
        }

        private Companion() {
        }
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }
}
