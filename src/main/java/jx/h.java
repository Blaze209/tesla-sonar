package jx;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class h extends hx.f {
    public h(ArrayList<hx.c> arrayList) {
        super(arrayList);
    }

    @Override // hx.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ArrayList<hx.c> d() {
        return new ArrayList<>(super.d());
    }

    @Override // hx.f
    @NonNull
    public String toString() {
        return a() + "{\n geometries=" + d() + "\n}\n";
    }
}
