package ak0;

import ezvcard.parameter.KeyType;
import ezvcard.property.Key;

/* JADX INFO: loaded from: classes8.dex */
public class y extends d<Key, KeyType> {
    public y() {
        super(Key.class, "KEY");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public KeyType i(String str) {
        return KeyType.f(null, null, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public KeyType j(String str) {
        return KeyType.g(null, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public KeyType k(String str) {
        return KeyType.g(str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Key l(String str, KeyType keyType) {
        return new Key(str, keyType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Key m(byte[] bArr, KeyType keyType) {
        return new Key(bArr, keyType);
    }
}
