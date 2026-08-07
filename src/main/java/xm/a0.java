package xm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.imagepipeline.memory.BasePool;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lxm/a0;", "", "Lcom/facebook/imagepipeline/memory/BasePool;", "basePool", "Ljn0/h0;", "g", "(Lcom/facebook/imagepipeline/memory/BasePool;)V", "", "bucketedSize", "b", "(I)V", DateTokenConverter.CONVERTER_KEY, "()V", "c", "size", "a", "sizeInBytes", "e", "f", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a0 {
    void a(int size);

    void b(int bucketedSize);

    void c();

    void d();

    void e(int sizeInBytes);

    void f(int sizeInBytes);

    void g(BasePool<?> basePool);
}
