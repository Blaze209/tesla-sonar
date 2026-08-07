package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteString f88302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExtensionRegistryLite f88303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f88304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected volatile MessageLite f88305d;

    protected void a(MessageLite messageLite) {
        if (this.f88305d != null) {
            return;
        }
        synchronized (this) {
            if (this.f88305d != null) {
                return;
            }
            try {
                if (this.f88302a != null) {
                    this.f88305d = messageLite.getParserForType().parseFrom(this.f88302a, this.f88303b);
                } else {
                    this.f88305d = messageLite;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int getSerializedSize() {
        return this.f88304c ? this.f88305d.getSerializedSize() : this.f88302a.size();
    }

    public MessageLite getValue(MessageLite messageLite) {
        a(messageLite);
        return this.f88305d;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.f88305d;
        this.f88305d = messageLite;
        this.f88302a = null;
        this.f88304c = true;
        return messageLite2;
    }
}
