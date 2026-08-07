package zb;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: zb.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lzb/d;", "", "", "elementsToJoin", "", "separator", "prefix", "postfix", "", "limit", "truncated", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "e", "c", DateTokenConverter.CONVERTER_KEY, "I", "f", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class JoinToStringArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Object> elementsToJoin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String separator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String prefix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postfix;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int limit;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String truncated;

    public JoinToStringArguments(List<? extends Object> elementsToJoin, String separator, String prefix, String postfix, int i11, String truncated) {
        s.k(elementsToJoin, "elementsToJoin");
        s.k(separator, "separator");
        s.k(prefix, "prefix");
        s.k(postfix, "postfix");
        s.k(truncated, "truncated");
        this.elementsToJoin = elementsToJoin;
        this.separator = separator;
        this.prefix = prefix;
        this.postfix = postfix;
        this.limit = i11;
        this.truncated = truncated;
    }

    public final List<Object> a() {
        return this.elementsToJoin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPostfix() {
        return this.postfix;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSeparator() {
        return this.separator;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinToStringArguments)) {
            return false;
        }
        JoinToStringArguments joinToStringArguments = (JoinToStringArguments) other;
        return s.f(this.elementsToJoin, joinToStringArguments.elementsToJoin) && s.f(this.separator, joinToStringArguments.separator) && s.f(this.prefix, joinToStringArguments.prefix) && s.f(this.postfix, joinToStringArguments.postfix) && this.limit == joinToStringArguments.limit && s.f(this.truncated, joinToStringArguments.truncated);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTruncated() {
        return this.truncated;
    }

    public int hashCode() {
        return (((((((((this.elementsToJoin.hashCode() * 31) + this.separator.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.postfix.hashCode()) * 31) + Integer.hashCode(this.limit)) * 31) + this.truncated.hashCode();
    }

    public String toString() {
        return "JoinToStringArguments(elementsToJoin=" + this.elementsToJoin + ", separator=" + this.separator + ", prefix=" + this.prefix + ", postfix=" + this.postfix + ", limit=" + this.limit + ", truncated=" + this.truncated + ")";
    }
}
