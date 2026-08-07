package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes3.dex */
class CharSequenceState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final char f19346c;
    int occurrences = 1;

    public CharSequenceState(char c11) {
        this.f19346c = c11;
    }

    void incrementOccurrences() {
        this.occurrences++;
    }
}
