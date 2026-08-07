package ak0;

import ezvcard.parameter.ImageType;
import ezvcard.property.ImageProperty;

/* JADX INFO: loaded from: classes8.dex */
public abstract class v<T extends ImageProperty> extends d<T, ImageType> {
    public v(Class<T> cls, String str) {
        super(cls, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ImageType i(String str) {
        return ImageType.f(null, null, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ImageType j(String str) {
        return ImageType.g(null, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ImageType k(String str) {
        return ImageType.g(str, null, null);
    }
}
