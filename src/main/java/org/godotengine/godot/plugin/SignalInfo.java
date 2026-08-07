package org.godotengine.godot.plugin;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class SignalInfo {
    private final String name;
    private final Class<?>[] paramTypes;
    private final String[] paramTypesNames;

    public SignalInfo(@NonNull String str, Class<?>... clsArr) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid signal name: " + str);
        }
        this.name = str;
        int i11 = 0;
        clsArr = clsArr == null ? new Class[0] : clsArr;
        this.paramTypes = clsArr;
        this.paramTypesNames = new String[clsArr.length];
        while (true) {
            Class<?>[] clsArr2 = this.paramTypes;
            if (i11 >= clsArr2.length) {
                return;
            }
            this.paramTypesNames[i11] = clsArr2[i11].getName();
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignalInfo) {
            return this.name.equals(((SignalInfo) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    Class<?>[] getParamTypes() {
        return this.paramTypes;
    }

    String[] getParamTypesNames() {
        return this.paramTypesNames;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return "SignalInfo{name='" + this.name + CoreConstants.SINGLE_QUOTE_CHAR + ", paramsTypes=" + Arrays.toString(this.paramTypes) + CoreConstants.CURLY_RIGHT;
    }
}
