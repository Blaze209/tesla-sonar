package ak0;

import ezvcard.parameter.ImageType;
import ezvcard.property.Photo;

/* JADX INFO: loaded from: classes8.dex */
public class k0 extends v<Photo> {
    public k0() {
        super(Photo.class, "PHOTO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Photo l(String str, ImageType imageType) {
        return new Photo(str, imageType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Photo m(byte[] bArr, ImageType imageType) {
        return new Photo(bArr, imageType);
    }
}
