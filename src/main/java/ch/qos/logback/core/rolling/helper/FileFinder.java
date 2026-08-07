package ch.qos.logback.core.rolling.helper;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class FileFinder {
    private static final String REGEX_MARKER_END = "(?:\uffff)?";
    private static final String REGEX_MARKER_START = "(?:\ufffe)?";
    private FileProvider fileProvider;

    FileFinder(FileProvider fileProvider) {
        this.fileProvider = fileProvider;
    }

    static String regexEscapePath(String str) {
        String str2 = File.separator;
        if (!str.contains(str2)) {
            return REGEX_MARKER_START + str + REGEX_MARKER_END;
        }
        String[] strArrSplit = str.split(str2);
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            if (strArrSplit[i11].length() > 0) {
                strArrSplit[i11] = REGEX_MARKER_START + strArrSplit[i11] + REGEX_MARKER_END;
            }
        }
        return TextUtils.join(File.separator, strArrSplit);
    }

    private List<String> toAbsolutePaths(List<File> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAbsolutePath());
        }
        return arrayList;
    }

    static String unescapePath(String str) {
        return str.replace(REGEX_MARKER_START, "").replace(REGEX_MARKER_END, "");
    }

    List<String> findDirs(String str) {
        List<PathPart> listSplitPath = splitPath(str);
        PathPart pathPart = listSplitPath.get(0);
        ArrayList arrayList = new ArrayList();
        findDirs(pathPart.listFiles(this.fileProvider), listSplitPath, 1, arrayList);
        return toAbsolutePaths(arrayList);
    }

    List<String> findFiles(String str) {
        List<PathPart> listSplitPath = splitPath(str);
        return toAbsolutePaths(findFiles(listSplitPath.get(0).listFiles(this.fileProvider), listSplitPath, 1));
    }

    List<PathPart> splitPath(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split(File.separator)) {
            boolean z11 = str2.contains(REGEX_MARKER_START) && str2.contains(REGEX_MARKER_END);
            String strReplace = str2.replace(REGEX_MARKER_START, "").replace(REGEX_MARKER_END, "");
            if (z11) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new LiteralPathPart(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new RegexPathPart(strReplace));
            } else {
                arrayList2.add(strReplace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new LiteralPathPart(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }

    private void findDirs(List<File> list, List<PathPart> list2, int i11, List<File> list3) {
        if (i11 >= list2.size() - 1) {
            return;
        }
        PathPart pathPart = list2.get(i11);
        for (File file : list) {
            if (this.fileProvider.isDirectory(file) && pathPart.matches(file)) {
                list3.add(file);
                findDirs(Arrays.asList(this.fileProvider.listFiles(file, null)), list2, i11 + 1, list3);
            }
        }
    }

    private List<File> findFiles(List<File> list, List<PathPart> list2, int i11) {
        ArrayList arrayList = new ArrayList();
        PathPart pathPart = list2.get(i11);
        int size = list2.size() - 1;
        Iterator<File> it = list.iterator();
        if (i11 >= size) {
            while (it.hasNext()) {
                File next = it.next();
                if (pathPart.matches(next)) {
                    arrayList.add(next);
                }
            }
        } else {
            while (it.hasNext()) {
                File next2 = it.next();
                if (this.fileProvider.isDirectory(next2) && pathPart.matches(next2)) {
                    arrayList.addAll(findFiles(Arrays.asList(this.fileProvider.listFiles(next2, null)), list2, i11 + 1));
                }
            }
        }
        return arrayList;
    }
}
