package ba0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lba0/c;", "Lba0/f;", "<init>", "()V", "Ljn0/h0;", "progressViewId", "", "tag", "", "isValidReactRootTag", "(I)Z", "generateViewId", "()I", "nextId", "I", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class c implements f {
    private int nextId = 3;

    private final boolean isValidReactRootTag(int tag) {
        return tag % 10 == 1;
    }

    private final void progressViewId() {
        int i11 = this.nextId + 2;
        this.nextId = i11;
        if (isValidReactRootTag(i11)) {
            this.nextId += 2;
        }
    }

    @Override // ba0.f
    public int generateViewId() {
        int i11 = this.nextId;
        progressViewId();
        return i11;
    }
}
