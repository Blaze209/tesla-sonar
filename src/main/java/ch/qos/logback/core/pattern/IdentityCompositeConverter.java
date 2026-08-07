package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes3.dex */
public class IdentityCompositeConverter<E> extends CompositeConverter<E> {
    @Override // ch.qos.logback.core.pattern.CompositeConverter
    protected String transform(E e11, String str) {
        return str;
    }
}
