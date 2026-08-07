package ak0;

import ezvcard.parameter.SoundType;
import ezvcard.property.Sound;

/* JADX INFO: loaded from: classes8.dex */
public class v0 extends d<Sound, SoundType> {
    public v0() {
        super(Sound.class, "SOUND");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public SoundType i(String str) {
        return SoundType.f(null, null, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public SoundType j(String str) {
        return SoundType.g(null, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public SoundType k(String str) {
        return SoundType.g(str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Sound l(String str, SoundType soundType) {
        return new Sound(str, soundType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Sound m(byte[] bArr, SoundType soundType) {
        return new Sound(bArr, soundType);
    }
}
