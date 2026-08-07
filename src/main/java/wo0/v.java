package wo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import xo0.w0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, d2 = {"Lwo0/v;", "Lkotlinx/serialization/json/JsonPrimitive;", "", "body", "", "isString", "Lto0/f;", "coerceToInlineType", "<init>", "(Ljava/lang/Object;ZLto0/f;)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "Lto0/f;", "e", "()Lto0/f;", "c", "Ljava/lang/String;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends JsonPrimitive {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final to0.f coerceToInlineType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String content;

    public /* synthetic */ v(Object obj, boolean z11, to0.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z11, (i11 & 4) != 0 ? null : fVar);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getContent() {
        return this.content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getIsString() {
        return this.isString;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final to0.f getCoerceToInlineType() {
        return this.coerceToInlineType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || v.class != other.getClass()) {
            return false;
        }
        v vVar = (v) other;
        return getIsString() == vVar.getIsString() && p013kotlin.jvm.internal.s.f(getContent(), vVar.getContent());
    }

    public int hashCode() {
        return (Boolean.hashCode(getIsString()) * 31) + getContent().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!getIsString()) {
            return getContent();
        }
        StringBuilder sb2 = new StringBuilder();
        w0.c(sb2, getContent());
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object body, boolean z11, to0.f fVar) {
        super(null);
        p013kotlin.jvm.internal.s.k(body, "body");
        this.isString = z11;
        this.coerceToInlineType = fVar;
        this.content = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
