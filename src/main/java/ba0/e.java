package ba0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lba0/e;", "Lba0/f;", "<init>", "()V", "", "generateViewId", "()I", "externalGenerator", "Lba0/f;", "getExternalGenerator", "()Lba0/f;", "setExternalGenerator", "(Lba0/f;)V", "defaultGenerator", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements f {
    public static final e INSTANCE = new e();
    private static final f defaultGenerator = new c();
    private static f externalGenerator;

    private e() {
    }

    @Override // ba0.f
    public int generateViewId() {
        f fVar = externalGenerator;
        return fVar != null ? fVar.generateViewId() : defaultGenerator.generateViewId();
    }

    public final f getExternalGenerator() {
        return externalGenerator;
    }

    public final void setExternalGenerator(f fVar) {
        externalGenerator = fVar;
    }
}
