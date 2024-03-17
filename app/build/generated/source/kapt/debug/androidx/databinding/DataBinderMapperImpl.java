package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new codeflies.com.saalimmvvm.DataBinderMapperImpl());
  }
}
