package com.fanxiaoyudemo.myapplication.JavaBean;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

public class Data extends Application {

    User user;
    Goods detailGoods=new Goods();
    List<Goods> goodsData=new List<Goods>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Goods> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Goods goods) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Goods> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends Goods> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Goods get(int index) {
            return null;
        }

        @Override
        public Goods set(int index, Goods element) {
            return null;
        }

        @Override
        public void add(int index, Goods element) {

        }

        @Override
        public Goods remove(int index) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Goods> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Goods> listIterator(int index) {
            return null;
        }

        @NonNull
        @Override
        public List<Goods> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    List<Goods> recordsData1=new List<Goods>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Goods> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Goods goods) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Goods> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends Goods> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Goods get(int index) {
            return null;
        }

        @Override
        public Goods set(int index, Goods element) {
            return null;
        }

        @Override
        public void add(int index, Goods element) {

        }

        @Override
        public Goods remove(int index) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Goods> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Goods> listIterator(int index) {
            return null;
        }

        @NonNull
        @Override
        public List<Goods> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    List<Goods> recordsData2=new List<Goods>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Goods> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Goods goods) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Goods> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends Goods> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Goods get(int index) {
            return null;
        }

        @Override
        public Goods set(int index, Goods element) {
            return null;
        }

        @Override
        public void add(int index, Goods element) {

        }

        @Override
        public Goods remove(int index) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Goods> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Goods> listIterator(int index) {
            return null;
        }

        @NonNull
        @Override
        public List<Goods> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private int flag_login=0;
    private int flag_check=0;
    private int flag_register=0;
    private int flag_sell=0;
    private int flag_buy=0;

    public int LOCK_LOGIN=0;
    public int LOCK_REGISTER=0;
    public int LOCK_CHECK=0;
    public int LOCK_SELL=0;
    public int LOCK_BUY=0;

    public Goods getDetailGoods() {
        return detailGoods;
    }

    public void setDetailGoods(Goods detailGoods) {
        this.detailGoods = detailGoods;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Goods> getListGoods() {
        return goodsData;
    }

    public void setListGoods(List<Goods> listGoods) {
        this.goodsData = listGoods;
    }

    public List<Goods> getRecordsData1() {
        return recordsData1;
    }

    public void setRecordsData1(List<Goods> recordsData1) {
        this.recordsData1 = recordsData1;
    }

    public List<Goods> getRecordsData2() {
        return recordsData2;
    }

    public void setRecordsData2(List<Goods> recordsData2) {
        this.recordsData2 = recordsData2;
    }

    public int getFlag_login() {
        return flag_login;
    }

    public void setFlag_login(int flag_login) {
        this.flag_login = flag_login;
    }

    public int getFlag_register() {
        return flag_register;
    }

    public void setFlag_register(int flag_register) {
        this.flag_register = flag_register;
    }

    public int getFlag_sell() {
        return flag_sell;
    }

    public void setFlag_sell(int flag_sell) {
        this.flag_sell = flag_sell;
    }

    public int getFlag_buy() {
        return flag_buy;
    }

    public void setFlag_buy(int flag_buy) {
        this.flag_buy = flag_buy;
    }

    public void check(String user_id) {

        User user_copy = new User();
        BmobQuery<User> bmobQuery = new BmobQuery<>();
        bmobQuery.addWhereEqualTo("user_id", user_id);
        if(LOCK_CHECK==0) {
            bmobQuery.findObjects(new FindListener<User>() {
                @Override
                public void done(List<User> object, BmobException e) {
                    if (e != null) {
                        return;
                    } else {
                        if (object.size() == 0) {
                            flag_check = 1;
                            Log.e("Bmob", "check可以注册");
                        }else{
                            Log.e("Bmob", "check不可以注册");
                        }
                        LOCK_CHECK=1;
                    }
                }
            });
        }

    }

    public void register(String user_id, String user_name, String user_password, String gender, String career, String colledge, String address) {
        User user_copy = new User();
        user_copy.setUser_id(user_id);
        check(user_id);
        if(LOCK_REGISTER==0&&LOCK_CHECK==1) {
            if (flag_check== 1) {
                Log.e("Bmob", "可以注册");
                user_copy.setUser_name(user_name);
                user_copy.setUser_password(user_password);
                user_copy.setGender(gender);
                user_copy.setCareer(career);
                user_copy.setColledge(colledge);
                user_copy.setAddress(address);
                user_copy.save(new SaveListener<String>() {
                    @Override
                    public void done(String objectId, BmobException e) {
                        if (e != null) {
                            return;
                        } else {
                            flag_register = 1;
                            user = user_copy;
                            Log.e("Bmob", "数据库添加完成");
                            Log.e("Bmob", "解锁");
                            LOCK_REGISTER = 1;
                        }
                    }
                });
            } else {
                Log.e("Bmob", "不能注册");
                Log.e("Bmob", "解锁");
                LOCK_REGISTER = 1;
            }
            LOCK_CHECK=0;
        }
    }

    public void login(String user_id, String user_password){
        User user_copy=new User();
        BmobQuery<User> bmobQuery = new BmobQuery<>();
        BmobQuery<User> query1 = new BmobQuery<>();
        BmobQuery<User> query2 = new BmobQuery<>();
        List<BmobQuery<User>> queries = new ArrayList<>();
        query1.addWhereEqualTo("user_id", user_id);
        query2.addWhereEqualTo("user_password", user_password);
        queries.add(query1);
        queries.add(query2);
        bmobQuery.and(queries);
        if(LOCK_LOGIN==0){
            bmobQuery.findObjects(new FindListener<User>() {
                @Override
                public void done(List<User> object, BmobException e) {
                    if (e != null) {
                        Log.e("Bmob","登录查询失败:"+e.getMessage());
                    } else {
                        if(object.size()==1){
                            flag_login=1;
                            user_copy.setUser_id(user_id);
                            user_copy.setUser_password(user_password);
                            user_copy.setUser_name(object.get(0).getUser_name());
                            user_copy.setGender(object.get(0).getGender());
                            user_copy.setColledge(object.get(0).getColledge());
                            user_copy.setColledge(object.get(0).getColledge());
                            user_copy.setAddress(object.get(0).getAdress());
                            Log.e("Bmob","成功查到了登录用户信息,flag_login="+String.valueOf(flag_login));
                            user=user_copy;
                        }else {
                            Log.e("Bmob","用户名或密码错误");
                        }
                        Log.e("Bmob","解锁");
                        LOCK_LOGIN=1;
                    }
                }
            });
        }
    }

    public void home_search(String name_search, String category){
        List<BmobQuery<Goods>> queries = new ArrayList<>();
        BmobQuery<Goods> bmobQuery = new BmobQuery<>();
        BmobQuery<Goods> query1 = new BmobQuery<>();
        BmobQuery<Goods> query2 = new BmobQuery<>();
        BmobQuery<Goods> query3 = new BmobQuery<>();
        if((category==null)||category.equals("")){
            //nothing
        }else {
            query1.addWhereEqualTo("category", category);
            queries.add(query1);
        }
        if((name_search==null)||name_search.equals("")){
            //nothing
        }else {
            //因为模糊查询要付费所以采用全等
            //query2.addWhereContains("goods_name", name_search);
            query2.addWhereEqualTo("goods_name", name_search);
            queries.add(query2);
        }
        query3.addWhereEqualTo("buyer_id","nobody");
        queries.add(query3);
        bmobQuery.and(queries);
        bmobQuery.findObjects(new FindListener<Goods>() {
            public void done(List<Goods> object, BmobException e) {
                int size;
                if (e != null) {
                } else {
                    goodsData=object;
                    size=object.size();
                }
            }
        });
    }

    public void sell(String goods_name,String category, Float price, String detail) {
        Goods myGoods=new Goods();
        myGoods.setGoods_name(goods_name);
            myGoods.setCategory(category);
            myGoods.setPrice(price);

            myGoods.setDetails(detail);

            myGoods.setSeller_name(this.user.getUser_name());
            myGoods.setSeller_id(this.user.getUser_id());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");// HH:mm:ss

            Date date = new Date(System.currentTimeMillis());
            String  release_time=simpleDateFormat.format(date);
            myGoods.setRelease_time(release_time);
            String name=user.getUser_name();
            if(LOCK_SELL==0){
                myGoods.save(new SaveListener<String>() {
                    @Override
                    public void done(String objectId, BmobException e) {
                        if (e != null) {
                            return;
                        }else{
                            flag_sell=1;
                            goodsData.add(myGoods);
                            LOCK_SELL=1;
                        }
                    }
                });
            }
    }

    public void buy(String object_id){
        Goods goods_copy = new Goods();
        goods_copy.setBuyer_id(user.getUser_id());
        goods_copy.setBuyer_name(user.getUser_name());
        if(LOCK_BUY==0){
            goods_copy.update(object_id, new UpdateListener() {
                @Override
                public void done(BmobException e) {
                    if(e==null){
                        flag_buy=1;

                    }
                    LOCK_BUY=1;
                }
            });
        }
    }

    public void record_search1(){
        BmobQuery<Goods> bmobQuery = new BmobQuery<>();
        bmobQuery.addWhereEqualTo("buyer_id",user.getUser_id());
        bmobQuery.findObjects(new FindListener<Goods>() {
            public void done(List<Goods> object, BmobException e) {
                int size;
                if (e != null) {
                } else {
                    recordsData1= (ArrayList<Goods>) object;
                    size=object.size();
                }
            }
        });
    }

    public void record_search2(){
        BmobQuery<Goods> bmobQuery = new BmobQuery<>();
        bmobQuery.addWhereEqualTo("seller_id",user.getUser_id());
        bmobQuery.findObjects(new FindListener<Goods>() {
            public void done(List<Goods> object, BmobException e) {
                int size;
                if (e != null) {
                } else {
                    recordsData2= (ArrayList<Goods>) object;
                    size=object.size();
                }
            }
        });
    }
}
