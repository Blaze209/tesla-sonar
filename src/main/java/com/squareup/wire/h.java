package com.squareup.wire;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.h.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000*\u0010\b\u0000\u0010\u0002 \u0001*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0002\u0010\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/squareup/wire/h;", "Lcom/squareup/wire/h$a;", "K", "T", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Lcom/squareup/wire/h$a;Ljava/lang/Object;)V", "X", "a", "(Lcom/squareup/wire/h$a;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/squareup/wire/h$a;", "getKey", "()Lcom/squareup/wire/h$a;", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final /* data */ class h<K extends a<T>, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final K key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/squareup/wire/h$a;", "T", "", "", "a", "I", "e", "()I", "tag", "Lcom/squareup/wire/ProtoAdapter;", "b", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "adapter", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "declaredName", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "redacted", "jsonName", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static abstract class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int tag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ProtoAdapter<T> adapter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String declaredName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean redacted;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String jsonName;

        public final ProtoAdapter<T> a() {
            return this.adapter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeclaredName() {
            return this.declaredName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getJsonName() {
            return this.jsonName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getRedacted() {
            return this.redacted;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getTag() {
            return this.tag;
        }
    }

    public h(K key, T t11) {
        s.k(key, "key");
        this.key = key;
        this.value = t11;
    }

    public final <X> X a(a<X> key) {
        s.k(key, "key");
        if (s.f(this.key, key)) {
            return this.value;
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return s.f(this.key, hVar.key) && s.f(this.value, hVar.value);
    }

    public int hashCode() {
        K k11 = this.key;
        int iHashCode = (k11 != null ? k11.hashCode() : 0) * 31;
        T t11 = this.value;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        ProtoAdapter<T> protoAdapterA = this.key.a();
        return this.key.getDeclaredName() + '=' + ((s.f(protoAdapterA, ProtoAdapter.STRING) || s.f(protoAdapterA, ProtoAdapter.STRING_VALUE)) ? x20.d.i(String.valueOf(this.value)) : String.valueOf(this.value));
    }
}
