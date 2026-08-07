package no0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Lno0/q;", "Target", "Type", "Lno0/a;", "Lno0/b;", "accessor", "", "name", "defaultValue", "Lno0/m;", "sign", "<init>", "(Lno0/b;Ljava/lang/String;Ljava/lang/Object;Lno0/m;)V", "a", "Lno0/b;", "()Lno0/b;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "Lno0/m;", "()Lno0/m;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q<Target, Type> extends a<Target, Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<Target, Type> accessor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Type defaultValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m<Target> sign;

    public /* synthetic */ q(b bVar, String str, Object obj, m mVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i11 & 2) != 0 ? bVar.getName() : str, (i11 & 4) != 0 ? null : obj, (i11 & 8) != 0 ? null : mVar);
    }

    @Override // no0.n
    public b<Target, Type> a() {
        return this.accessor;
    }

    @Override // no0.n
    public m<Target> b() {
        return this.sign;
    }

    @Override // no0.n
    public Type getDefaultValue() {
        return this.defaultValue;
    }

    @Override // no0.n
    public String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(b<? super Target, Type> accessor, String name, Type type, m<? super Target> mVar) {
        p013kotlin.jvm.internal.s.k(accessor, "accessor");
        p013kotlin.jvm.internal.s.k(name, "name");
        this.accessor = accessor;
        this.name = name;
        this.defaultValue = type;
        this.sign = mVar;
    }
}
