package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0080\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B3\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/stripe/android/stripe3ds2/views/b;", "", "", "directoryServerName", "", "drawableResId", "nameResId", "", "shouldStretch", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V", "Ljava/lang/String;", "getDirectoryServerName$3ds2sdk_release", "()Ljava/lang/String;", "I", "getDrawableResId$3ds2sdk_release", "()I", "Ljava/lang/Integer;", "getNameResId$3ds2sdk_release", "()Ljava/lang/Integer;", "Z", "getShouldStretch$3ds2sdk_release", "()Z", "Companion", "a", "Visa", "Mastercard", "Amex", "Discover", "CartesBancaires", "UnionPay", "Unknown", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum b {
    Visa("visa", n80.c.f93631h, Integer.valueOf(n80.f.f93674f), false, 8, null),
    Mastercard("mastercard", n80.c.f93628e, Integer.valueOf(n80.f.f93672d), false, 8, null),
    Amex("american_express", n80.c.f93624a, Integer.valueOf(n80.f.f93669a), false, 8, null),
    Discover("discover", n80.c.f93626c, Integer.valueOf(n80.f.f93671c), false, 8, null),
    CartesBancaires("cartes_bancaires", n80.c.f93625b, Integer.valueOf(n80.f.f93670b), true),
    UnionPay("unionpay", n80.c.f93629f, Integer.valueOf(n80.f.f93673e), false, 8, null),
    Unknown("unknown", n80.c.f93630g, null, false, 8, null);

    private final String directoryServerName;
    private final int drawableResId;
    private final Integer nameResId;
    private final boolean shouldStretch;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/b$a;", "", "<init>", "()V", "", "directoryServerName", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/views/b;", "a", "(Ljava/lang/String;Lr80/c;)Lcom/stripe/android/stripe3ds2/views/b;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String directoryServerName, r80.c errorReporter) {
            b next;
            Object objB;
            p013kotlin.jvm.internal.s.k(directoryServerName, "directoryServerName");
            p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
            Iterator<b> it = b.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.text.t.M(next.getDirectoryServerName(), p013kotlin.text.t.F1(directoryServerName).toString(), true));
            b bVar = next;
            if (bVar != null) {
                objB = jn0.s.b(bVar);
            } else {
                EnumEntries<b> entries = b.getEntries();
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(entries, 10));
                Iterator<b> it2 = entries.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getDirectoryServerName());
                }
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(new SDKRuntimeException("Directory server name '" + directoryServerName + "' is not supported. Must be one of " + arrayList + ".", null, 2, null)));
            }
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                errorReporter.Y0(thE);
            }
            b bVar2 = b.Unknown;
            if (jn0.s.g(objB)) {
                objB = bVar2;
            }
            return (b) objB;
        }

        private Companion() {
        }
    }

    b(String str, int i11, Integer num, boolean z11) {
        this.directoryServerName = str;
        this.drawableResId = i11;
        this.nameResId = num;
        this.shouldStretch = z11;
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getDirectoryServerName$3ds2sdk_release, reason: from getter */
    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    /* JADX INFO: renamed from: getDrawableResId$3ds2sdk_release, reason: from getter */
    public final int getDrawableResId() {
        return this.drawableResId;
    }

    /* JADX INFO: renamed from: getNameResId$3ds2sdk_release, reason: from getter */
    public final Integer getNameResId() {
        return this.nameResId;
    }

    /* JADX INFO: renamed from: getShouldStretch$3ds2sdk_release, reason: from getter */
    public final boolean getShouldStretch() {
        return this.shouldStretch;
    }

    /* synthetic */ b(String str, int i11, Integer num, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, num, (i12 & 8) != 0 ? false : z11);
    }
}
