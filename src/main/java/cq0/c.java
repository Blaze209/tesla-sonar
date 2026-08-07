package cq0;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
class c extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<File> f58904a;

    public c(Comparator<File> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.f58904a = comparator;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        return this.f58904a.compare(file2, file);
    }

    @Override // cq0.a
    public String toString() {
        return super.toString() + "[" + this.f58904a.toString() + "]";
    }
}
