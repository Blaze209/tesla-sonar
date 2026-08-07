package e3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0014B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006$"}, d2 = {"Le3/k;", "", "", "Le3/m;", "autofillTypes", "Lj3/i;", "boundingBox", "Lkotlin/Function1;", "", "Ljn0/h0;", "onFill", "<init>", "(Ljava/util/List;Lj3/i;Lwn0/l;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lj3/i;", DateTokenConverter.CONVERTER_KEY, "()Lj3/i;", "g", "(Lj3/i;)V", "Lwn0/l;", "f", "()Lwn0/l;", "I", "e", "id", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61592f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f61593g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<m> autofillTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private j3.i boundingBox;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, h0> onFill;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: e3.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le3/k$a;", "", "<init>", "()V", "", "b", "()I", "previousId", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b() {
            int i11;
            synchronized (this) {
                k.f61593g++;
                i11 = k.f61593g;
            }
            return i11;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends m> list, j3.i iVar, wn0.l<? super String, h0> lVar) {
        this.autofillTypes = list;
        this.boundingBox = iVar;
        this.onFill = lVar;
        this.id = INSTANCE.b();
    }

    public final List<m> c() {
        return this.autofillTypes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j3.i getBoundingBox() {
        return this.boundingBox;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return s.f(this.autofillTypes, kVar.autofillTypes) && s.f(this.boundingBox, kVar.boundingBox) && this.onFill == kVar.onFill;
    }

    public final wn0.l<String, h0> f() {
        return this.onFill;
    }

    public final void g(j3.i iVar) {
        this.boundingBox = iVar;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        j3.i iVar = this.boundingBox;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        wn0.l<String, h0> lVar = this.onFill;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public /* synthetic */ k(List list, j3.i iVar, wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? v.m() : list, (i11 & 2) != 0 ? null : iVar, lVar);
    }
}
