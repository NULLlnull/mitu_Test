package com.mt.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MituXsxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MituXsxxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXsxhIsNull() {
            addCriterion("xsxh is null");
            return (Criteria) this;
        }

        public Criteria andXsxhIsNotNull() {
            addCriterion("xsxh is not null");
            return (Criteria) this;
        }

        public Criteria andXsxhEqualTo(String value) {
            addCriterion("xsxh =", value, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhNotEqualTo(String value) {
            addCriterion("xsxh <>", value, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhGreaterThan(String value) {
            addCriterion("xsxh >", value, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhGreaterThanOrEqualTo(String value) {
            addCriterion("xsxh >=", value, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhLessThan(String value) {
            addCriterion("xsxh <", value, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhLessThanOrEqualTo(String value) {
            addCriterion("xsxh <=", value, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhLike(String value) {
            addCriterion("xsxh like", value, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhNotLike(String value) {
            addCriterion("xsxh not like", value, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhIn(List<String> values) {
            addCriterion("xsxh in", values, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhNotIn(List<String> values) {
            addCriterion("xsxh not in", values, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhBetween(String value1, String value2) {
            addCriterion("xsxh between", value1, value2, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXsxhNotBetween(String value1, String value2) {
            addCriterion("xsxh not between", value1, value2, "xsxh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(Boolean value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(Boolean value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(Boolean value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(Boolean value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(Boolean value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(Boolean value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<Boolean> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<Boolean> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(Boolean value1, Boolean value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(Boolean value1, Boolean value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNull() {
            addCriterion("zjlx is null");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNotNull() {
            addCriterion("zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andZjlxEqualTo(Boolean value) {
            addCriterion("zjlx =", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotEqualTo(Boolean value) {
            addCriterion("zjlx <>", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThan(Boolean value) {
            addCriterion("zjlx >", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zjlx >=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThan(Boolean value) {
            addCriterion("zjlx <", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThanOrEqualTo(Boolean value) {
            addCriterion("zjlx <=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxIn(List<Boolean> values) {
            addCriterion("zjlx in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotIn(List<Boolean> values) {
            addCriterion("zjlx not in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxBetween(Boolean value1, Boolean value2) {
            addCriterion("zjlx between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zjlx not between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxmcIsNull() {
            addCriterion("zjlxmc is null");
            return (Criteria) this;
        }

        public Criteria andZjlxmcIsNotNull() {
            addCriterion("zjlxmc is not null");
            return (Criteria) this;
        }

        public Criteria andZjlxmcEqualTo(String value) {
            addCriterion("zjlxmc =", value, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcNotEqualTo(String value) {
            addCriterion("zjlxmc <>", value, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcGreaterThan(String value) {
            addCriterion("zjlxmc >", value, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcGreaterThanOrEqualTo(String value) {
            addCriterion("zjlxmc >=", value, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcLessThan(String value) {
            addCriterion("zjlxmc <", value, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcLessThanOrEqualTo(String value) {
            addCriterion("zjlxmc <=", value, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcLike(String value) {
            addCriterion("zjlxmc like", value, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcNotLike(String value) {
            addCriterion("zjlxmc not like", value, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcIn(List<String> values) {
            addCriterion("zjlxmc in", values, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcNotIn(List<String> values) {
            addCriterion("zjlxmc not in", values, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcBetween(String value1, String value2) {
            addCriterion("zjlxmc between", value1, value2, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjlxmcNotBetween(String value1, String value2) {
            addCriterion("zjlxmc not between", value1, value2, "zjlxmc");
            return (Criteria) this;
        }

        public Criteria andZjhIsNull() {
            addCriterion("zjh is null");
            return (Criteria) this;
        }

        public Criteria andZjhIsNotNull() {
            addCriterion("zjh is not null");
            return (Criteria) this;
        }

        public Criteria andZjhEqualTo(String value) {
            addCriterion("zjh =", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotEqualTo(String value) {
            addCriterion("zjh <>", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhGreaterThan(String value) {
            addCriterion("zjh >", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhGreaterThanOrEqualTo(String value) {
            addCriterion("zjh >=", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhLessThan(String value) {
            addCriterion("zjh <", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhLessThanOrEqualTo(String value) {
            addCriterion("zjh <=", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhLike(String value) {
            addCriterion("zjh like", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotLike(String value) {
            addCriterion("zjh not like", value, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhIn(List<String> values) {
            addCriterion("zjh in", values, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotIn(List<String> values) {
            addCriterion("zjh not in", values, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhBetween(String value1, String value2) {
            addCriterion("zjh between", value1, value2, "zjh");
            return (Criteria) this;
        }

        public Criteria andZjhNotBetween(String value1, String value2) {
            addCriterion("zjh not between", value1, value2, "zjh");
            return (Criteria) this;
        }

        public Criteria andCsnyIsNull() {
            addCriterion("csny is null");
            return (Criteria) this;
        }

        public Criteria andCsnyIsNotNull() {
            addCriterion("csny is not null");
            return (Criteria) this;
        }

        public Criteria andCsnyEqualTo(Date value) {
            addCriterionForJDBCDate("csny =", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotEqualTo(Date value) {
            addCriterionForJDBCDate("csny <>", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyGreaterThan(Date value) {
            addCriterionForJDBCDate("csny >", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csny >=", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyLessThan(Date value) {
            addCriterionForJDBCDate("csny <", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csny <=", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyIn(List<Date> values) {
            addCriterionForJDBCDate("csny in", values, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotIn(List<Date> values) {
            addCriterionForJDBCDate("csny not in", values, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csny between", value1, value2, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csny not between", value1, value2, "csny");
            return (Criteria) this;
        }

        public Criteria andMzdmIsNull() {
            addCriterion("mzdm is null");
            return (Criteria) this;
        }

        public Criteria andMzdmIsNotNull() {
            addCriterion("mzdm is not null");
            return (Criteria) this;
        }

        public Criteria andMzdmEqualTo(String value) {
            addCriterion("mzdm =", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmNotEqualTo(String value) {
            addCriterion("mzdm <>", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmGreaterThan(String value) {
            addCriterion("mzdm >", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmGreaterThanOrEqualTo(String value) {
            addCriterion("mzdm >=", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmLessThan(String value) {
            addCriterion("mzdm <", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmLessThanOrEqualTo(String value) {
            addCriterion("mzdm <=", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmLike(String value) {
            addCriterion("mzdm like", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmNotLike(String value) {
            addCriterion("mzdm not like", value, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmIn(List<String> values) {
            addCriterion("mzdm in", values, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmNotIn(List<String> values) {
            addCriterion("mzdm not in", values, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmBetween(String value1, String value2) {
            addCriterion("mzdm between", value1, value2, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzdmNotBetween(String value1, String value2) {
            addCriterion("mzdm not between", value1, value2, "mzdm");
            return (Criteria) this;
        }

        public Criteria andMzmcIsNull() {
            addCriterion("mzmc is null");
            return (Criteria) this;
        }

        public Criteria andMzmcIsNotNull() {
            addCriterion("mzmc is not null");
            return (Criteria) this;
        }

        public Criteria andMzmcEqualTo(String value) {
            addCriterion("mzmc =", value, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcNotEqualTo(String value) {
            addCriterion("mzmc <>", value, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcGreaterThan(String value) {
            addCriterion("mzmc >", value, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcGreaterThanOrEqualTo(String value) {
            addCriterion("mzmc >=", value, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcLessThan(String value) {
            addCriterion("mzmc <", value, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcLessThanOrEqualTo(String value) {
            addCriterion("mzmc <=", value, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcLike(String value) {
            addCriterion("mzmc like", value, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcNotLike(String value) {
            addCriterion("mzmc not like", value, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcIn(List<String> values) {
            addCriterion("mzmc in", values, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcNotIn(List<String> values) {
            addCriterion("mzmc not in", values, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcBetween(String value1, String value2) {
            addCriterion("mzmc between", value1, value2, "mzmc");
            return (Criteria) this;
        }

        public Criteria andMzmcNotBetween(String value1, String value2) {
            addCriterion("mzmc not between", value1, value2, "mzmc");
            return (Criteria) this;
        }

        public Criteria andZzmmdmIsNull() {
            addCriterion("zzmmdm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmdmIsNotNull() {
            addCriterion("zzmmdm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmdmEqualTo(String value) {
            addCriterion("zzmmdm =", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmNotEqualTo(String value) {
            addCriterion("zzmmdm <>", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmGreaterThan(String value) {
            addCriterion("zzmmdm >", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmmdm >=", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmLessThan(String value) {
            addCriterion("zzmmdm <", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmLessThanOrEqualTo(String value) {
            addCriterion("zzmmdm <=", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmLike(String value) {
            addCriterion("zzmmdm like", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmNotLike(String value) {
            addCriterion("zzmmdm not like", value, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmIn(List<String> values) {
            addCriterion("zzmmdm in", values, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmNotIn(List<String> values) {
            addCriterion("zzmmdm not in", values, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmBetween(String value1, String value2) {
            addCriterion("zzmmdm between", value1, value2, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmdmNotBetween(String value1, String value2) {
            addCriterion("zzmmdm not between", value1, value2, "zzmmdm");
            return (Criteria) this;
        }

        public Criteria andZzmmmcIsNull() {
            addCriterion("zzmmmc is null");
            return (Criteria) this;
        }

        public Criteria andZzmmmcIsNotNull() {
            addCriterion("zzmmmc is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmmcEqualTo(String value) {
            addCriterion("zzmmmc =", value, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcNotEqualTo(String value) {
            addCriterion("zzmmmc <>", value, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcGreaterThan(String value) {
            addCriterion("zzmmmc >", value, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcGreaterThanOrEqualTo(String value) {
            addCriterion("zzmmmc >=", value, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcLessThan(String value) {
            addCriterion("zzmmmc <", value, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcLessThanOrEqualTo(String value) {
            addCriterion("zzmmmc <=", value, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcLike(String value) {
            addCriterion("zzmmmc like", value, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcNotLike(String value) {
            addCriterion("zzmmmc not like", value, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcIn(List<String> values) {
            addCriterion("zzmmmc in", values, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcNotIn(List<String> values) {
            addCriterion("zzmmmc not in", values, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcBetween(String value1, String value2) {
            addCriterion("zzmmmc between", value1, value2, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andZzmmmcNotBetween(String value1, String value2) {
            addCriterion("zzmmmc not between", value1, value2, "zzmmmc");
            return (Criteria) this;
        }

        public Criteria andHyzkdmIsNull() {
            addCriterion("hyzkdm is null");
            return (Criteria) this;
        }

        public Criteria andHyzkdmIsNotNull() {
            addCriterion("hyzkdm is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkdmEqualTo(String value) {
            addCriterion("hyzkdm =", value, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmNotEqualTo(String value) {
            addCriterion("hyzkdm <>", value, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmGreaterThan(String value) {
            addCriterion("hyzkdm >", value, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmGreaterThanOrEqualTo(String value) {
            addCriterion("hyzkdm >=", value, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmLessThan(String value) {
            addCriterion("hyzkdm <", value, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmLessThanOrEqualTo(String value) {
            addCriterion("hyzkdm <=", value, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmLike(String value) {
            addCriterion("hyzkdm like", value, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmNotLike(String value) {
            addCriterion("hyzkdm not like", value, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmIn(List<String> values) {
            addCriterion("hyzkdm in", values, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmNotIn(List<String> values) {
            addCriterion("hyzkdm not in", values, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmBetween(String value1, String value2) {
            addCriterion("hyzkdm between", value1, value2, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andHyzkdmNotBetween(String value1, String value2) {
            addCriterion("hyzkdm not between", value1, value2, "hyzkdm");
            return (Criteria) this;
        }

        public Criteria andJtdhIsNull() {
            addCriterion("jtdh is null");
            return (Criteria) this;
        }

        public Criteria andJtdhIsNotNull() {
            addCriterion("jtdh is not null");
            return (Criteria) this;
        }

        public Criteria andJtdhEqualTo(String value) {
            addCriterion("jtdh =", value, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhNotEqualTo(String value) {
            addCriterion("jtdh <>", value, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhGreaterThan(String value) {
            addCriterion("jtdh >", value, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhGreaterThanOrEqualTo(String value) {
            addCriterion("jtdh >=", value, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhLessThan(String value) {
            addCriterion("jtdh <", value, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhLessThanOrEqualTo(String value) {
            addCriterion("jtdh <=", value, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhLike(String value) {
            addCriterion("jtdh like", value, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhNotLike(String value) {
            addCriterion("jtdh not like", value, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhIn(List<String> values) {
            addCriterion("jtdh in", values, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhNotIn(List<String> values) {
            addCriterion("jtdh not in", values, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhBetween(String value1, String value2) {
            addCriterion("jtdh between", value1, value2, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdhNotBetween(String value1, String value2) {
            addCriterion("jtdh not between", value1, value2, "jtdh");
            return (Criteria) this;
        }

        public Criteria andJtdzIsNull() {
            addCriterion("jtdz is null");
            return (Criteria) this;
        }

        public Criteria andJtdzIsNotNull() {
            addCriterion("jtdz is not null");
            return (Criteria) this;
        }

        public Criteria andJtdzEqualTo(String value) {
            addCriterion("jtdz =", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzNotEqualTo(String value) {
            addCriterion("jtdz <>", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzGreaterThan(String value) {
            addCriterion("jtdz >", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzGreaterThanOrEqualTo(String value) {
            addCriterion("jtdz >=", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzLessThan(String value) {
            addCriterion("jtdz <", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzLessThanOrEqualTo(String value) {
            addCriterion("jtdz <=", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzLike(String value) {
            addCriterion("jtdz like", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzNotLike(String value) {
            addCriterion("jtdz not like", value, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzIn(List<String> values) {
            addCriterion("jtdz in", values, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzNotIn(List<String> values) {
            addCriterion("jtdz not in", values, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzBetween(String value1, String value2) {
            addCriterion("jtdz between", value1, value2, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzNotBetween(String value1, String value2) {
            addCriterion("jtdz not between", value1, value2, "jtdz");
            return (Criteria) this;
        }

        public Criteria andJtdzybIsNull() {
            addCriterion("jtdzyb is null");
            return (Criteria) this;
        }

        public Criteria andJtdzybIsNotNull() {
            addCriterion("jtdzyb is not null");
            return (Criteria) this;
        }

        public Criteria andJtdzybEqualTo(String value) {
            addCriterion("jtdzyb =", value, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybNotEqualTo(String value) {
            addCriterion("jtdzyb <>", value, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybGreaterThan(String value) {
            addCriterion("jtdzyb >", value, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybGreaterThanOrEqualTo(String value) {
            addCriterion("jtdzyb >=", value, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybLessThan(String value) {
            addCriterion("jtdzyb <", value, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybLessThanOrEqualTo(String value) {
            addCriterion("jtdzyb <=", value, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybLike(String value) {
            addCriterion("jtdzyb like", value, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybNotLike(String value) {
            addCriterion("jtdzyb not like", value, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybIn(List<String> values) {
            addCriterion("jtdzyb in", values, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybNotIn(List<String> values) {
            addCriterion("jtdzyb not in", values, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybBetween(String value1, String value2) {
            addCriterion("jtdzyb between", value1, value2, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andJtdzybNotBetween(String value1, String value2) {
            addCriterion("jtdzyb not between", value1, value2, "jtdzyb");
            return (Criteria) this;
        }

        public Criteria andByxxIsNull() {
            addCriterion("byxx is null");
            return (Criteria) this;
        }

        public Criteria andByxxIsNotNull() {
            addCriterion("byxx is not null");
            return (Criteria) this;
        }

        public Criteria andByxxEqualTo(String value) {
            addCriterion("byxx =", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxNotEqualTo(String value) {
            addCriterion("byxx <>", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxGreaterThan(String value) {
            addCriterion("byxx >", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxGreaterThanOrEqualTo(String value) {
            addCriterion("byxx >=", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxLessThan(String value) {
            addCriterion("byxx <", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxLessThanOrEqualTo(String value) {
            addCriterion("byxx <=", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxLike(String value) {
            addCriterion("byxx like", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxNotLike(String value) {
            addCriterion("byxx not like", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxIn(List<String> values) {
            addCriterion("byxx in", values, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxNotIn(List<String> values) {
            addCriterion("byxx not in", values, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxBetween(String value1, String value2) {
            addCriterion("byxx between", value1, value2, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxNotBetween(String value1, String value2) {
            addCriterion("byxx not between", value1, value2, "byxx");
            return (Criteria) this;
        }

        public Criteria andByzyIsNull() {
            addCriterion("byzy is null");
            return (Criteria) this;
        }

        public Criteria andByzyIsNotNull() {
            addCriterion("byzy is not null");
            return (Criteria) this;
        }

        public Criteria andByzyEqualTo(String value) {
            addCriterion("byzy =", value, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyNotEqualTo(String value) {
            addCriterion("byzy <>", value, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyGreaterThan(String value) {
            addCriterion("byzy >", value, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyGreaterThanOrEqualTo(String value) {
            addCriterion("byzy >=", value, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyLessThan(String value) {
            addCriterion("byzy <", value, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyLessThanOrEqualTo(String value) {
            addCriterion("byzy <=", value, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyLike(String value) {
            addCriterion("byzy like", value, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyNotLike(String value) {
            addCriterion("byzy not like", value, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyIn(List<String> values) {
            addCriterion("byzy in", values, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyNotIn(List<String> values) {
            addCriterion("byzy not in", values, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyBetween(String value1, String value2) {
            addCriterion("byzy between", value1, value2, "byzy");
            return (Criteria) this;
        }

        public Criteria andByzyNotBetween(String value1, String value2) {
            addCriterion("byzy not between", value1, value2, "byzy");
            return (Criteria) this;
        }

        public Criteria andPykssyIsNull() {
            addCriterion("pykssy is null");
            return (Criteria) this;
        }

        public Criteria andPykssyIsNotNull() {
            addCriterion("pykssy is not null");
            return (Criteria) this;
        }

        public Criteria andPykssyEqualTo(String value) {
            addCriterion("pykssy =", value, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyNotEqualTo(String value) {
            addCriterion("pykssy <>", value, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyGreaterThan(String value) {
            addCriterion("pykssy >", value, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyGreaterThanOrEqualTo(String value) {
            addCriterion("pykssy >=", value, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyLessThan(String value) {
            addCriterion("pykssy <", value, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyLessThanOrEqualTo(String value) {
            addCriterion("pykssy <=", value, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyLike(String value) {
            addCriterion("pykssy like", value, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyNotLike(String value) {
            addCriterion("pykssy not like", value, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyIn(List<String> values) {
            addCriterion("pykssy in", values, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyNotIn(List<String> values) {
            addCriterion("pykssy not in", values, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyBetween(String value1, String value2) {
            addCriterion("pykssy between", value1, value2, "pykssy");
            return (Criteria) this;
        }

        public Criteria andPykssyNotBetween(String value1, String value2) {
            addCriterion("pykssy not between", value1, value2, "pykssy");
            return (Criteria) this;
        }

        public Criteria andGkkshIsNull() {
            addCriterion("gkksh is null");
            return (Criteria) this;
        }

        public Criteria andGkkshIsNotNull() {
            addCriterion("gkksh is not null");
            return (Criteria) this;
        }

        public Criteria andGkkshEqualTo(String value) {
            addCriterion("gkksh =", value, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshNotEqualTo(String value) {
            addCriterion("gkksh <>", value, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshGreaterThan(String value) {
            addCriterion("gkksh >", value, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshGreaterThanOrEqualTo(String value) {
            addCriterion("gkksh >=", value, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshLessThan(String value) {
            addCriterion("gkksh <", value, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshLessThanOrEqualTo(String value) {
            addCriterion("gkksh <=", value, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshLike(String value) {
            addCriterion("gkksh like", value, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshNotLike(String value) {
            addCriterion("gkksh not like", value, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshIn(List<String> values) {
            addCriterion("gkksh in", values, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshNotIn(List<String> values) {
            addCriterion("gkksh not in", values, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshBetween(String value1, String value2) {
            addCriterion("gkksh between", value1, value2, "gkksh");
            return (Criteria) this;
        }

        public Criteria andGkkshNotBetween(String value1, String value2) {
            addCriterion("gkksh not between", value1, value2, "gkksh");
            return (Criteria) this;
        }

        public Criteria andZwhIsNull() {
            addCriterion("zwh is null");
            return (Criteria) this;
        }

        public Criteria andZwhIsNotNull() {
            addCriterion("zwh is not null");
            return (Criteria) this;
        }

        public Criteria andZwhEqualTo(Short value) {
            addCriterion("zwh =", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhNotEqualTo(Short value) {
            addCriterion("zwh <>", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhGreaterThan(Short value) {
            addCriterion("zwh >", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhGreaterThanOrEqualTo(Short value) {
            addCriterion("zwh >=", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhLessThan(Short value) {
            addCriterion("zwh <", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhLessThanOrEqualTo(Short value) {
            addCriterion("zwh <=", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhIn(List<Short> values) {
            addCriterion("zwh in", values, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhNotIn(List<Short> values) {
            addCriterion("zwh not in", values, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhBetween(Short value1, Short value2) {
            addCriterion("zwh between", value1, value2, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhNotBetween(Short value1, Short value2) {
            addCriterion("zwh not between", value1, value2, "zwh");
            return (Criteria) this;
        }

        public Criteria andRxnyIsNull() {
            addCriterion("rxny is null");
            return (Criteria) this;
        }

        public Criteria andRxnyIsNotNull() {
            addCriterion("rxny is not null");
            return (Criteria) this;
        }

        public Criteria andRxnyEqualTo(Date value) {
            addCriterionForJDBCDate("rxny =", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyNotEqualTo(Date value) {
            addCriterionForJDBCDate("rxny <>", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyGreaterThan(Date value) {
            addCriterionForJDBCDate("rxny >", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rxny >=", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyLessThan(Date value) {
            addCriterionForJDBCDate("rxny <", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rxny <=", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyIn(List<Date> values) {
            addCriterionForJDBCDate("rxny in", values, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyNotIn(List<Date> values) {
            addCriterionForJDBCDate("rxny not in", values, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rxny between", value1, value2, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rxny not between", value1, value2, "rxny");
            return (Criteria) this;
        }

        public Criteria andSsxyIsNull() {
            addCriterion("ssxy is null");
            return (Criteria) this;
        }

        public Criteria andSsxyIsNotNull() {
            addCriterion("ssxy is not null");
            return (Criteria) this;
        }

        public Criteria andSsxyEqualTo(String value) {
            addCriterion("ssxy =", value, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyNotEqualTo(String value) {
            addCriterion("ssxy <>", value, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyGreaterThan(String value) {
            addCriterion("ssxy >", value, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyGreaterThanOrEqualTo(String value) {
            addCriterion("ssxy >=", value, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyLessThan(String value) {
            addCriterion("ssxy <", value, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyLessThanOrEqualTo(String value) {
            addCriterion("ssxy <=", value, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyLike(String value) {
            addCriterion("ssxy like", value, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyNotLike(String value) {
            addCriterion("ssxy not like", value, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyIn(List<String> values) {
            addCriterion("ssxy in", values, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyNotIn(List<String> values) {
            addCriterion("ssxy not in", values, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyBetween(String value1, String value2) {
            addCriterion("ssxy between", value1, value2, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxyNotBetween(String value1, String value2) {
            addCriterion("ssxy not between", value1, value2, "ssxy");
            return (Criteria) this;
        }

        public Criteria andSsxbIsNull() {
            addCriterion("ssxb is null");
            return (Criteria) this;
        }

        public Criteria andSsxbIsNotNull() {
            addCriterion("ssxb is not null");
            return (Criteria) this;
        }

        public Criteria andSsxbEqualTo(String value) {
            addCriterion("ssxb =", value, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbNotEqualTo(String value) {
            addCriterion("ssxb <>", value, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbGreaterThan(String value) {
            addCriterion("ssxb >", value, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbGreaterThanOrEqualTo(String value) {
            addCriterion("ssxb >=", value, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbLessThan(String value) {
            addCriterion("ssxb <", value, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbLessThanOrEqualTo(String value) {
            addCriterion("ssxb <=", value, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbLike(String value) {
            addCriterion("ssxb like", value, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbNotLike(String value) {
            addCriterion("ssxb not like", value, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbIn(List<String> values) {
            addCriterion("ssxb in", values, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbNotIn(List<String> values) {
            addCriterion("ssxb not in", values, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbBetween(String value1, String value2) {
            addCriterion("ssxb between", value1, value2, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbNotBetween(String value1, String value2) {
            addCriterion("ssxb not between", value1, value2, "ssxb");
            return (Criteria) this;
        }

        public Criteria andSsxbmcIsNull() {
            addCriterion("ssxbmc is null");
            return (Criteria) this;
        }

        public Criteria andSsxbmcIsNotNull() {
            addCriterion("ssxbmc is not null");
            return (Criteria) this;
        }

        public Criteria andSsxbmcEqualTo(String value) {
            addCriterion("ssxbmc =", value, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcNotEqualTo(String value) {
            addCriterion("ssxbmc <>", value, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcGreaterThan(String value) {
            addCriterion("ssxbmc >", value, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcGreaterThanOrEqualTo(String value) {
            addCriterion("ssxbmc >=", value, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcLessThan(String value) {
            addCriterion("ssxbmc <", value, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcLessThanOrEqualTo(String value) {
            addCriterion("ssxbmc <=", value, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcLike(String value) {
            addCriterion("ssxbmc like", value, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcNotLike(String value) {
            addCriterion("ssxbmc not like", value, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcIn(List<String> values) {
            addCriterion("ssxbmc in", values, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcNotIn(List<String> values) {
            addCriterion("ssxbmc not in", values, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcBetween(String value1, String value2) {
            addCriterion("ssxbmc between", value1, value2, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSsxbmcNotBetween(String value1, String value2) {
            addCriterion("ssxbmc not between", value1, value2, "ssxbmc");
            return (Criteria) this;
        }

        public Criteria andSszyIsNull() {
            addCriterion("sszy is null");
            return (Criteria) this;
        }

        public Criteria andSszyIsNotNull() {
            addCriterion("sszy is not null");
            return (Criteria) this;
        }

        public Criteria andSszyEqualTo(String value) {
            addCriterion("sszy =", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyNotEqualTo(String value) {
            addCriterion("sszy <>", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyGreaterThan(String value) {
            addCriterion("sszy >", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyGreaterThanOrEqualTo(String value) {
            addCriterion("sszy >=", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyLessThan(String value) {
            addCriterion("sszy <", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyLessThanOrEqualTo(String value) {
            addCriterion("sszy <=", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyLike(String value) {
            addCriterion("sszy like", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyNotLike(String value) {
            addCriterion("sszy not like", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyIn(List<String> values) {
            addCriterion("sszy in", values, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyNotIn(List<String> values) {
            addCriterion("sszy not in", values, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyBetween(String value1, String value2) {
            addCriterion("sszy between", value1, value2, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyNotBetween(String value1, String value2) {
            addCriterion("sszy not between", value1, value2, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszymcIsNull() {
            addCriterion("sszymc is null");
            return (Criteria) this;
        }

        public Criteria andSszymcIsNotNull() {
            addCriterion("sszymc is not null");
            return (Criteria) this;
        }

        public Criteria andSszymcEqualTo(String value) {
            addCriterion("sszymc =", value, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcNotEqualTo(String value) {
            addCriterion("sszymc <>", value, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcGreaterThan(String value) {
            addCriterion("sszymc >", value, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcGreaterThanOrEqualTo(String value) {
            addCriterion("sszymc >=", value, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcLessThan(String value) {
            addCriterion("sszymc <", value, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcLessThanOrEqualTo(String value) {
            addCriterion("sszymc <=", value, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcLike(String value) {
            addCriterion("sszymc like", value, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcNotLike(String value) {
            addCriterion("sszymc not like", value, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcIn(List<String> values) {
            addCriterion("sszymc in", values, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcNotIn(List<String> values) {
            addCriterion("sszymc not in", values, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcBetween(String value1, String value2) {
            addCriterion("sszymc between", value1, value2, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSszymcNotBetween(String value1, String value2) {
            addCriterion("sszymc not between", value1, value2, "sszymc");
            return (Criteria) this;
        }

        public Criteria andSsbjIsNull() {
            addCriterion("ssbj is null");
            return (Criteria) this;
        }

        public Criteria andSsbjIsNotNull() {
            addCriterion("ssbj is not null");
            return (Criteria) this;
        }

        public Criteria andSsbjEqualTo(String value) {
            addCriterion("ssbj =", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjNotEqualTo(String value) {
            addCriterion("ssbj <>", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjGreaterThan(String value) {
            addCriterion("ssbj >", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjGreaterThanOrEqualTo(String value) {
            addCriterion("ssbj >=", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjLessThan(String value) {
            addCriterion("ssbj <", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjLessThanOrEqualTo(String value) {
            addCriterion("ssbj <=", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjLike(String value) {
            addCriterion("ssbj like", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjNotLike(String value) {
            addCriterion("ssbj not like", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjIn(List<String> values) {
            addCriterion("ssbj in", values, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjNotIn(List<String> values) {
            addCriterion("ssbj not in", values, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjBetween(String value1, String value2) {
            addCriterion("ssbj between", value1, value2, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjNotBetween(String value1, String value2) {
            addCriterion("ssbj not between", value1, value2, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjmcIsNull() {
            addCriterion("ssbjmc is null");
            return (Criteria) this;
        }

        public Criteria andSsbjmcIsNotNull() {
            addCriterion("ssbjmc is not null");
            return (Criteria) this;
        }

        public Criteria andSsbjmcEqualTo(String value) {
            addCriterion("ssbjmc =", value, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcNotEqualTo(String value) {
            addCriterion("ssbjmc <>", value, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcGreaterThan(String value) {
            addCriterion("ssbjmc >", value, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcGreaterThanOrEqualTo(String value) {
            addCriterion("ssbjmc >=", value, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcLessThan(String value) {
            addCriterion("ssbjmc <", value, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcLessThanOrEqualTo(String value) {
            addCriterion("ssbjmc <=", value, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcLike(String value) {
            addCriterion("ssbjmc like", value, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcNotLike(String value) {
            addCriterion("ssbjmc not like", value, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcIn(List<String> values) {
            addCriterion("ssbjmc in", values, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcNotIn(List<String> values) {
            addCriterion("ssbjmc not in", values, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcBetween(String value1, String value2) {
            addCriterion("ssbjmc between", value1, value2, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andSsbjmcNotBetween(String value1, String value2) {
            addCriterion("ssbjmc not between", value1, value2, "ssbjmc");
            return (Criteria) this;
        }

        public Criteria andXslbIsNull() {
            addCriterion("xslb is null");
            return (Criteria) this;
        }

        public Criteria andXslbIsNotNull() {
            addCriterion("xslb is not null");
            return (Criteria) this;
        }

        public Criteria andXslbEqualTo(String value) {
            addCriterion("xslb =", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotEqualTo(String value) {
            addCriterion("xslb <>", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbGreaterThan(String value) {
            addCriterion("xslb >", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbGreaterThanOrEqualTo(String value) {
            addCriterion("xslb >=", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLessThan(String value) {
            addCriterion("xslb <", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLessThanOrEqualTo(String value) {
            addCriterion("xslb <=", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLike(String value) {
            addCriterion("xslb like", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotLike(String value) {
            addCriterion("xslb not like", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbIn(List<String> values) {
            addCriterion("xslb in", values, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotIn(List<String> values) {
            addCriterion("xslb not in", values, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbBetween(String value1, String value2) {
            addCriterion("xslb between", value1, value2, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotBetween(String value1, String value2) {
            addCriterion("xslb not between", value1, value2, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbmcIsNull() {
            addCriterion("xslbmc is null");
            return (Criteria) this;
        }

        public Criteria andXslbmcIsNotNull() {
            addCriterion("xslbmc is not null");
            return (Criteria) this;
        }

        public Criteria andXslbmcEqualTo(String value) {
            addCriterion("xslbmc =", value, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcNotEqualTo(String value) {
            addCriterion("xslbmc <>", value, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcGreaterThan(String value) {
            addCriterion("xslbmc >", value, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcGreaterThanOrEqualTo(String value) {
            addCriterion("xslbmc >=", value, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcLessThan(String value) {
            addCriterion("xslbmc <", value, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcLessThanOrEqualTo(String value) {
            addCriterion("xslbmc <=", value, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcLike(String value) {
            addCriterion("xslbmc like", value, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcNotLike(String value) {
            addCriterion("xslbmc not like", value, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcIn(List<String> values) {
            addCriterion("xslbmc in", values, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcNotIn(List<String> values) {
            addCriterion("xslbmc not in", values, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcBetween(String value1, String value2) {
            addCriterion("xslbmc between", value1, value2, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXslbmcNotBetween(String value1, String value2) {
            addCriterion("xslbmc not between", value1, value2, "xslbmc");
            return (Criteria) this;
        }

        public Criteria andXsztIsNull() {
            addCriterion("xszt is null");
            return (Criteria) this;
        }

        public Criteria andXsztIsNotNull() {
            addCriterion("xszt is not null");
            return (Criteria) this;
        }

        public Criteria andXsztEqualTo(String value) {
            addCriterion("xszt =", value, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztNotEqualTo(String value) {
            addCriterion("xszt <>", value, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztGreaterThan(String value) {
            addCriterion("xszt >", value, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztGreaterThanOrEqualTo(String value) {
            addCriterion("xszt >=", value, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztLessThan(String value) {
            addCriterion("xszt <", value, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztLessThanOrEqualTo(String value) {
            addCriterion("xszt <=", value, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztLike(String value) {
            addCriterion("xszt like", value, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztNotLike(String value) {
            addCriterion("xszt not like", value, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztIn(List<String> values) {
            addCriterion("xszt in", values, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztNotIn(List<String> values) {
            addCriterion("xszt not in", values, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztBetween(String value1, String value2) {
            addCriterion("xszt between", value1, value2, "xszt");
            return (Criteria) this;
        }

        public Criteria andXsztNotBetween(String value1, String value2) {
            addCriterion("xszt not between", value1, value2, "xszt");
            return (Criteria) this;
        }

        public Criteria andXjztIsNull() {
            addCriterion("xjzt is null");
            return (Criteria) this;
        }

        public Criteria andXjztIsNotNull() {
            addCriterion("xjzt is not null");
            return (Criteria) this;
        }

        public Criteria andXjztEqualTo(String value) {
            addCriterion("xjzt =", value, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztNotEqualTo(String value) {
            addCriterion("xjzt <>", value, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztGreaterThan(String value) {
            addCriterion("xjzt >", value, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztGreaterThanOrEqualTo(String value) {
            addCriterion("xjzt >=", value, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztLessThan(String value) {
            addCriterion("xjzt <", value, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztLessThanOrEqualTo(String value) {
            addCriterion("xjzt <=", value, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztLike(String value) {
            addCriterion("xjzt like", value, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztNotLike(String value) {
            addCriterion("xjzt not like", value, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztIn(List<String> values) {
            addCriterion("xjzt in", values, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztNotIn(List<String> values) {
            addCriterion("xjzt not in", values, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztBetween(String value1, String value2) {
            addCriterion("xjzt between", value1, value2, "xjzt");
            return (Criteria) this;
        }

        public Criteria andXjztNotBetween(String value1, String value2) {
            addCriterion("xjzt not between", value1, value2, "xjzt");
            return (Criteria) this;
        }

        public Criteria andByztIsNull() {
            addCriterion("byzt is null");
            return (Criteria) this;
        }

        public Criteria andByztIsNotNull() {
            addCriterion("byzt is not null");
            return (Criteria) this;
        }

        public Criteria andByztEqualTo(String value) {
            addCriterion("byzt =", value, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztNotEqualTo(String value) {
            addCriterion("byzt <>", value, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztGreaterThan(String value) {
            addCriterion("byzt >", value, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztGreaterThanOrEqualTo(String value) {
            addCriterion("byzt >=", value, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztLessThan(String value) {
            addCriterion("byzt <", value, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztLessThanOrEqualTo(String value) {
            addCriterion("byzt <=", value, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztLike(String value) {
            addCriterion("byzt like", value, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztNotLike(String value) {
            addCriterion("byzt not like", value, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztIn(List<String> values) {
            addCriterion("byzt in", values, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztNotIn(List<String> values) {
            addCriterion("byzt not in", values, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztBetween(String value1, String value2) {
            addCriterion("byzt between", value1, value2, "byzt");
            return (Criteria) this;
        }

        public Criteria andByztNotBetween(String value1, String value2) {
            addCriterion("byzt not between", value1, value2, "byzt");
            return (Criteria) this;
        }

        public Criteria andLxrxmIsNull() {
            addCriterion("lxrxm is null");
            return (Criteria) this;
        }

        public Criteria andLxrxmIsNotNull() {
            addCriterion("lxrxm is not null");
            return (Criteria) this;
        }

        public Criteria andLxrxmEqualTo(String value) {
            addCriterion("lxrxm =", value, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmNotEqualTo(String value) {
            addCriterion("lxrxm <>", value, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmGreaterThan(String value) {
            addCriterion("lxrxm >", value, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmGreaterThanOrEqualTo(String value) {
            addCriterion("lxrxm >=", value, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmLessThan(String value) {
            addCriterion("lxrxm <", value, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmLessThanOrEqualTo(String value) {
            addCriterion("lxrxm <=", value, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmLike(String value) {
            addCriterion("lxrxm like", value, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmNotLike(String value) {
            addCriterion("lxrxm not like", value, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmIn(List<String> values) {
            addCriterion("lxrxm in", values, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmNotIn(List<String> values) {
            addCriterion("lxrxm not in", values, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmBetween(String value1, String value2) {
            addCriterion("lxrxm between", value1, value2, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrxmNotBetween(String value1, String value2) {
            addCriterion("lxrxm not between", value1, value2, "lxrxm");
            return (Criteria) this;
        }

        public Criteria andLxrdhIsNull() {
            addCriterion("lxrdh is null");
            return (Criteria) this;
        }

        public Criteria andLxrdhIsNotNull() {
            addCriterion("lxrdh is not null");
            return (Criteria) this;
        }

        public Criteria andLxrdhEqualTo(String value) {
            addCriterion("lxrdh =", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhNotEqualTo(String value) {
            addCriterion("lxrdh <>", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhGreaterThan(String value) {
            addCriterion("lxrdh >", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhGreaterThanOrEqualTo(String value) {
            addCriterion("lxrdh >=", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhLessThan(String value) {
            addCriterion("lxrdh <", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhLessThanOrEqualTo(String value) {
            addCriterion("lxrdh <=", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhLike(String value) {
            addCriterion("lxrdh like", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhNotLike(String value) {
            addCriterion("lxrdh not like", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhIn(List<String> values) {
            addCriterion("lxrdh in", values, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhNotIn(List<String> values) {
            addCriterion("lxrdh not in", values, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhBetween(String value1, String value2) {
            addCriterion("lxrdh between", value1, value2, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhNotBetween(String value1, String value2) {
            addCriterion("lxrdh not between", value1, value2, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andCzryIsNull() {
            addCriterion("czry is null");
            return (Criteria) this;
        }

        public Criteria andCzryIsNotNull() {
            addCriterion("czry is not null");
            return (Criteria) this;
        }

        public Criteria andCzryEqualTo(String value) {
            addCriterion("czry =", value, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryNotEqualTo(String value) {
            addCriterion("czry <>", value, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryGreaterThan(String value) {
            addCriterion("czry >", value, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryGreaterThanOrEqualTo(String value) {
            addCriterion("czry >=", value, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryLessThan(String value) {
            addCriterion("czry <", value, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryLessThanOrEqualTo(String value) {
            addCriterion("czry <=", value, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryLike(String value) {
            addCriterion("czry like", value, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryNotLike(String value) {
            addCriterion("czry not like", value, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryIn(List<String> values) {
            addCriterion("czry in", values, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryNotIn(List<String> values) {
            addCriterion("czry not in", values, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryBetween(String value1, String value2) {
            addCriterion("czry between", value1, value2, "czry");
            return (Criteria) this;
        }

        public Criteria andCzryNotBetween(String value1, String value2) {
            addCriterion("czry not between", value1, value2, "czry");
            return (Criteria) this;
        }

        public Criteria andCzrxmIsNull() {
            addCriterion("czrxm is null");
            return (Criteria) this;
        }

        public Criteria andCzrxmIsNotNull() {
            addCriterion("czrxm is not null");
            return (Criteria) this;
        }

        public Criteria andCzrxmEqualTo(String value) {
            addCriterion("czrxm =", value, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmNotEqualTo(String value) {
            addCriterion("czrxm <>", value, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmGreaterThan(String value) {
            addCriterion("czrxm >", value, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmGreaterThanOrEqualTo(String value) {
            addCriterion("czrxm >=", value, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmLessThan(String value) {
            addCriterion("czrxm <", value, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmLessThanOrEqualTo(String value) {
            addCriterion("czrxm <=", value, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmLike(String value) {
            addCriterion("czrxm like", value, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmNotLike(String value) {
            addCriterion("czrxm not like", value, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmIn(List<String> values) {
            addCriterion("czrxm in", values, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmNotIn(List<String> values) {
            addCriterion("czrxm not in", values, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmBetween(String value1, String value2) {
            addCriterion("czrxm between", value1, value2, "czrxm");
            return (Criteria) this;
        }

        public Criteria andCzrxmNotBetween(String value1, String value2) {
            addCriterion("czrxm not between", value1, value2, "czrxm");
            return (Criteria) this;
        }

        public Criteria andZsqkIsNull() {
            addCriterion("zsqk is null");
            return (Criteria) this;
        }

        public Criteria andZsqkIsNotNull() {
            addCriterion("zsqk is not null");
            return (Criteria) this;
        }

        public Criteria andZsqkEqualTo(String value) {
            addCriterion("zsqk =", value, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkNotEqualTo(String value) {
            addCriterion("zsqk <>", value, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkGreaterThan(String value) {
            addCriterion("zsqk >", value, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkGreaterThanOrEqualTo(String value) {
            addCriterion("zsqk >=", value, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkLessThan(String value) {
            addCriterion("zsqk <", value, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkLessThanOrEqualTo(String value) {
            addCriterion("zsqk <=", value, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkLike(String value) {
            addCriterion("zsqk like", value, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkNotLike(String value) {
            addCriterion("zsqk not like", value, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkIn(List<String> values) {
            addCriterion("zsqk in", values, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkNotIn(List<String> values) {
            addCriterion("zsqk not in", values, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkBetween(String value1, String value2) {
            addCriterion("zsqk between", value1, value2, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkNotBetween(String value1, String value2) {
            addCriterion("zsqk not between", value1, value2, "zsqk");
            return (Criteria) this;
        }

        public Criteria andZsqkmcIsNull() {
            addCriterion("zsqkmc is null");
            return (Criteria) this;
        }

        public Criteria andZsqkmcIsNotNull() {
            addCriterion("zsqkmc is not null");
            return (Criteria) this;
        }

        public Criteria andZsqkmcEqualTo(String value) {
            addCriterion("zsqkmc =", value, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcNotEqualTo(String value) {
            addCriterion("zsqkmc <>", value, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcGreaterThan(String value) {
            addCriterion("zsqkmc >", value, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcGreaterThanOrEqualTo(String value) {
            addCriterion("zsqkmc >=", value, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcLessThan(String value) {
            addCriterion("zsqkmc <", value, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcLessThanOrEqualTo(String value) {
            addCriterion("zsqkmc <=", value, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcLike(String value) {
            addCriterion("zsqkmc like", value, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcNotLike(String value) {
            addCriterion("zsqkmc not like", value, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcIn(List<String> values) {
            addCriterion("zsqkmc in", values, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcNotIn(List<String> values) {
            addCriterion("zsqkmc not in", values, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcBetween(String value1, String value2) {
            addCriterion("zsqkmc between", value1, value2, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZsqkmcNotBetween(String value1, String value2) {
            addCriterion("zsqkmc not between", value1, value2, "zsqkmc");
            return (Criteria) this;
        }

        public Criteria andZpIsNull() {
            addCriterion("zp is null");
            return (Criteria) this;
        }

        public Criteria andZpIsNotNull() {
            addCriterion("zp is not null");
            return (Criteria) this;
        }

        public Criteria andZpEqualTo(String value) {
            addCriterion("zp =", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotEqualTo(String value) {
            addCriterion("zp <>", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpGreaterThan(String value) {
            addCriterion("zp >", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpGreaterThanOrEqualTo(String value) {
            addCriterion("zp >=", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLessThan(String value) {
            addCriterion("zp <", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLessThanOrEqualTo(String value) {
            addCriterion("zp <=", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLike(String value) {
            addCriterion("zp like", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotLike(String value) {
            addCriterion("zp not like", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpIn(List<String> values) {
            addCriterion("zp in", values, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotIn(List<String> values) {
            addCriterion("zp not in", values, "zp");
            return (Criteria) this;
        }

        public Criteria andZpBetween(String value1, String value2) {
            addCriterion("zp between", value1, value2, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotBetween(String value1, String value2) {
            addCriterion("zp not between", value1, value2, "zp");
            return (Criteria) this;
        }

        public Criteria andYhmcIsNull() {
            addCriterion("yhmc is null");
            return (Criteria) this;
        }

        public Criteria andYhmcIsNotNull() {
            addCriterion("yhmc is not null");
            return (Criteria) this;
        }

        public Criteria andYhmcEqualTo(String value) {
            addCriterion("yhmc =", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotEqualTo(String value) {
            addCriterion("yhmc <>", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcGreaterThan(String value) {
            addCriterion("yhmc >", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcGreaterThanOrEqualTo(String value) {
            addCriterion("yhmc >=", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLessThan(String value) {
            addCriterion("yhmc <", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLessThanOrEqualTo(String value) {
            addCriterion("yhmc <=", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLike(String value) {
            addCriterion("yhmc like", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotLike(String value) {
            addCriterion("yhmc not like", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcIn(List<String> values) {
            addCriterion("yhmc in", values, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotIn(List<String> values) {
            addCriterion("yhmc not in", values, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcBetween(String value1, String value2) {
            addCriterion("yhmc between", value1, value2, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotBetween(String value1, String value2) {
            addCriterion("yhmc not between", value1, value2, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhzhIsNull() {
            addCriterion("yhzh is null");
            return (Criteria) this;
        }

        public Criteria andYhzhIsNotNull() {
            addCriterion("yhzh is not null");
            return (Criteria) this;
        }

        public Criteria andYhzhEqualTo(String value) {
            addCriterion("yhzh =", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotEqualTo(String value) {
            addCriterion("yhzh <>", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhGreaterThan(String value) {
            addCriterion("yhzh >", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhGreaterThanOrEqualTo(String value) {
            addCriterion("yhzh >=", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLessThan(String value) {
            addCriterion("yhzh <", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLessThanOrEqualTo(String value) {
            addCriterion("yhzh <=", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLike(String value) {
            addCriterion("yhzh like", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotLike(String value) {
            addCriterion("yhzh not like", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhIn(List<String> values) {
            addCriterion("yhzh in", values, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotIn(List<String> values) {
            addCriterion("yhzh not in", values, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhBetween(String value1, String value2) {
            addCriterion("yhzh between", value1, value2, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotBetween(String value1, String value2) {
            addCriterion("yhzh not between", value1, value2, "yhzh");
            return (Criteria) this;
        }

        public Criteria andSydqIsNull() {
            addCriterion("sydq is null");
            return (Criteria) this;
        }

        public Criteria andSydqIsNotNull() {
            addCriterion("sydq is not null");
            return (Criteria) this;
        }

        public Criteria andSydqEqualTo(String value) {
            addCriterion("sydq =", value, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqNotEqualTo(String value) {
            addCriterion("sydq <>", value, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqGreaterThan(String value) {
            addCriterion("sydq >", value, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqGreaterThanOrEqualTo(String value) {
            addCriterion("sydq >=", value, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqLessThan(String value) {
            addCriterion("sydq <", value, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqLessThanOrEqualTo(String value) {
            addCriterion("sydq <=", value, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqLike(String value) {
            addCriterion("sydq like", value, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqNotLike(String value) {
            addCriterion("sydq not like", value, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqIn(List<String> values) {
            addCriterion("sydq in", values, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqNotIn(List<String> values) {
            addCriterion("sydq not in", values, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqBetween(String value1, String value2) {
            addCriterion("sydq between", value1, value2, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqNotBetween(String value1, String value2) {
            addCriterion("sydq not between", value1, value2, "sydq");
            return (Criteria) this;
        }

        public Criteria andSydqmcIsNull() {
            addCriterion("sydqmc is null");
            return (Criteria) this;
        }

        public Criteria andSydqmcIsNotNull() {
            addCriterion("sydqmc is not null");
            return (Criteria) this;
        }

        public Criteria andSydqmcEqualTo(String value) {
            addCriterion("sydqmc =", value, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcNotEqualTo(String value) {
            addCriterion("sydqmc <>", value, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcGreaterThan(String value) {
            addCriterion("sydqmc >", value, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcGreaterThanOrEqualTo(String value) {
            addCriterion("sydqmc >=", value, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcLessThan(String value) {
            addCriterion("sydqmc <", value, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcLessThanOrEqualTo(String value) {
            addCriterion("sydqmc <=", value, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcLike(String value) {
            addCriterion("sydqmc like", value, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcNotLike(String value) {
            addCriterion("sydqmc not like", value, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcIn(List<String> values) {
            addCriterion("sydqmc in", values, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcNotIn(List<String> values) {
            addCriterion("sydqmc not in", values, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcBetween(String value1, String value2) {
            addCriterion("sydqmc between", value1, value2, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andSydqmcNotBetween(String value1, String value2) {
            addCriterion("sydqmc not between", value1, value2, "sydqmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlIsNull() {
            addCriterion("zsssjzl is null");
            return (Criteria) this;
        }

        public Criteria andZsssjzlIsNotNull() {
            addCriterion("zsssjzl is not null");
            return (Criteria) this;
        }

        public Criteria andZsssjzlEqualTo(String value) {
            addCriterion("zsssjzl =", value, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlNotEqualTo(String value) {
            addCriterion("zsssjzl <>", value, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlGreaterThan(String value) {
            addCriterion("zsssjzl >", value, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlGreaterThanOrEqualTo(String value) {
            addCriterion("zsssjzl >=", value, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlLessThan(String value) {
            addCriterion("zsssjzl <", value, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlLessThanOrEqualTo(String value) {
            addCriterion("zsssjzl <=", value, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlLike(String value) {
            addCriterion("zsssjzl like", value, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlNotLike(String value) {
            addCriterion("zsssjzl not like", value, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlIn(List<String> values) {
            addCriterion("zsssjzl in", values, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlNotIn(List<String> values) {
            addCriterion("zsssjzl not in", values, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlBetween(String value1, String value2) {
            addCriterion("zsssjzl between", value1, value2, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssjzlNotBetween(String value1, String value2) {
            addCriterion("zsssjzl not between", value1, value2, "zsssjzl");
            return (Criteria) this;
        }

        public Criteria andZsssfjhIsNull() {
            addCriterion("zsssfjh is null");
            return (Criteria) this;
        }

        public Criteria andZsssfjhIsNotNull() {
            addCriterion("zsssfjh is not null");
            return (Criteria) this;
        }

        public Criteria andZsssfjhEqualTo(String value) {
            addCriterion("zsssfjh =", value, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhNotEqualTo(String value) {
            addCriterion("zsssfjh <>", value, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhGreaterThan(String value) {
            addCriterion("zsssfjh >", value, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhGreaterThanOrEqualTo(String value) {
            addCriterion("zsssfjh >=", value, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhLessThan(String value) {
            addCriterion("zsssfjh <", value, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhLessThanOrEqualTo(String value) {
            addCriterion("zsssfjh <=", value, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhLike(String value) {
            addCriterion("zsssfjh like", value, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhNotLike(String value) {
            addCriterion("zsssfjh not like", value, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhIn(List<String> values) {
            addCriterion("zsssfjh in", values, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhNotIn(List<String> values) {
            addCriterion("zsssfjh not in", values, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhBetween(String value1, String value2) {
            addCriterion("zsssfjh between", value1, value2, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssfjhNotBetween(String value1, String value2) {
            addCriterion("zsssfjh not between", value1, value2, "zsssfjh");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcIsNull() {
            addCriterion("zsssjzlmc is null");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcIsNotNull() {
            addCriterion("zsssjzlmc is not null");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcEqualTo(String value) {
            addCriterion("zsssjzlmc =", value, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcNotEqualTo(String value) {
            addCriterion("zsssjzlmc <>", value, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcGreaterThan(String value) {
            addCriterion("zsssjzlmc >", value, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcGreaterThanOrEqualTo(String value) {
            addCriterion("zsssjzlmc >=", value, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcLessThan(String value) {
            addCriterion("zsssjzlmc <", value, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcLessThanOrEqualTo(String value) {
            addCriterion("zsssjzlmc <=", value, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcLike(String value) {
            addCriterion("zsssjzlmc like", value, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcNotLike(String value) {
            addCriterion("zsssjzlmc not like", value, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcIn(List<String> values) {
            addCriterion("zsssjzlmc in", values, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcNotIn(List<String> values) {
            addCriterion("zsssjzlmc not in", values, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcBetween(String value1, String value2) {
            addCriterion("zsssjzlmc between", value1, value2, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andZsssjzlmcNotBetween(String value1, String value2) {
            addCriterion("zsssjzlmc not between", value1, value2, "zsssjzlmc");
            return (Criteria) this;
        }

        public Criteria andGatqwdmIsNull() {
            addCriterion("gatqwdm is null");
            return (Criteria) this;
        }

        public Criteria andGatqwdmIsNotNull() {
            addCriterion("gatqwdm is not null");
            return (Criteria) this;
        }

        public Criteria andGatqwdmEqualTo(String value) {
            addCriterion("gatqwdm =", value, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmNotEqualTo(String value) {
            addCriterion("gatqwdm <>", value, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmGreaterThan(String value) {
            addCriterion("gatqwdm >", value, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmGreaterThanOrEqualTo(String value) {
            addCriterion("gatqwdm >=", value, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmLessThan(String value) {
            addCriterion("gatqwdm <", value, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmLessThanOrEqualTo(String value) {
            addCriterion("gatqwdm <=", value, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmLike(String value) {
            addCriterion("gatqwdm like", value, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmNotLike(String value) {
            addCriterion("gatqwdm not like", value, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmIn(List<String> values) {
            addCriterion("gatqwdm in", values, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmNotIn(List<String> values) {
            addCriterion("gatqwdm not in", values, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmBetween(String value1, String value2) {
            addCriterion("gatqwdm between", value1, value2, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwdmNotBetween(String value1, String value2) {
            addCriterion("gatqwdm not between", value1, value2, "gatqwdm");
            return (Criteria) this;
        }

        public Criteria andGatqwmcIsNull() {
            addCriterion("gatqwmc is null");
            return (Criteria) this;
        }

        public Criteria andGatqwmcIsNotNull() {
            addCriterion("gatqwmc is not null");
            return (Criteria) this;
        }

        public Criteria andGatqwmcEqualTo(String value) {
            addCriterion("gatqwmc =", value, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcNotEqualTo(String value) {
            addCriterion("gatqwmc <>", value, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcGreaterThan(String value) {
            addCriterion("gatqwmc >", value, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcGreaterThanOrEqualTo(String value) {
            addCriterion("gatqwmc >=", value, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcLessThan(String value) {
            addCriterion("gatqwmc <", value, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcLessThanOrEqualTo(String value) {
            addCriterion("gatqwmc <=", value, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcLike(String value) {
            addCriterion("gatqwmc like", value, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcNotLike(String value) {
            addCriterion("gatqwmc not like", value, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcIn(List<String> values) {
            addCriterion("gatqwmc in", values, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcNotIn(List<String> values) {
            addCriterion("gatqwmc not in", values, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcBetween(String value1, String value2) {
            addCriterion("gatqwmc between", value1, value2, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andGatqwmcNotBetween(String value1, String value2) {
            addCriterion("gatqwmc not between", value1, value2, "gatqwmc");
            return (Criteria) this;
        }

        public Criteria andSfsqznIsNull() {
            addCriterion("sfsqzn is null");
            return (Criteria) this;
        }

        public Criteria andSfsqznIsNotNull() {
            addCriterion("sfsqzn is not null");
            return (Criteria) this;
        }

        public Criteria andSfsqznEqualTo(String value) {
            addCriterion("sfsqzn =", value, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznNotEqualTo(String value) {
            addCriterion("sfsqzn <>", value, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznGreaterThan(String value) {
            addCriterion("sfsqzn >", value, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznGreaterThanOrEqualTo(String value) {
            addCriterion("sfsqzn >=", value, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznLessThan(String value) {
            addCriterion("sfsqzn <", value, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznLessThanOrEqualTo(String value) {
            addCriterion("sfsqzn <=", value, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznLike(String value) {
            addCriterion("sfsqzn like", value, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznNotLike(String value) {
            addCriterion("sfsqzn not like", value, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznIn(List<String> values) {
            addCriterion("sfsqzn in", values, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznNotIn(List<String> values) {
            addCriterion("sfsqzn not in", values, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznBetween(String value1, String value2) {
            addCriterion("sfsqzn between", value1, value2, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andSfsqznNotBetween(String value1, String value2) {
            addCriterion("sfsqzn not between", value1, value2, "sfsqzn");
            return (Criteria) this;
        }

        public Criteria andCsdqIsNull() {
            addCriterion("csdq is null");
            return (Criteria) this;
        }

        public Criteria andCsdqIsNotNull() {
            addCriterion("csdq is not null");
            return (Criteria) this;
        }

        public Criteria andCsdqEqualTo(String value) {
            addCriterion("csdq =", value, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqNotEqualTo(String value) {
            addCriterion("csdq <>", value, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqGreaterThan(String value) {
            addCriterion("csdq >", value, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqGreaterThanOrEqualTo(String value) {
            addCriterion("csdq >=", value, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqLessThan(String value) {
            addCriterion("csdq <", value, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqLessThanOrEqualTo(String value) {
            addCriterion("csdq <=", value, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqLike(String value) {
            addCriterion("csdq like", value, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqNotLike(String value) {
            addCriterion("csdq not like", value, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqIn(List<String> values) {
            addCriterion("csdq in", values, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqNotIn(List<String> values) {
            addCriterion("csdq not in", values, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqBetween(String value1, String value2) {
            addCriterion("csdq between", value1, value2, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqNotBetween(String value1, String value2) {
            addCriterion("csdq not between", value1, value2, "csdq");
            return (Criteria) this;
        }

        public Criteria andCsdqmcIsNull() {
            addCriterion("csdqmc is null");
            return (Criteria) this;
        }

        public Criteria andCsdqmcIsNotNull() {
            addCriterion("csdqmc is not null");
            return (Criteria) this;
        }

        public Criteria andCsdqmcEqualTo(String value) {
            addCriterion("csdqmc =", value, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcNotEqualTo(String value) {
            addCriterion("csdqmc <>", value, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcGreaterThan(String value) {
            addCriterion("csdqmc >", value, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcGreaterThanOrEqualTo(String value) {
            addCriterion("csdqmc >=", value, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcLessThan(String value) {
            addCriterion("csdqmc <", value, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcLessThanOrEqualTo(String value) {
            addCriterion("csdqmc <=", value, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcLike(String value) {
            addCriterion("csdqmc like", value, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcNotLike(String value) {
            addCriterion("csdqmc not like", value, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcIn(List<String> values) {
            addCriterion("csdqmc in", values, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcNotIn(List<String> values) {
            addCriterion("csdqmc not in", values, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcBetween(String value1, String value2) {
            addCriterion("csdqmc between", value1, value2, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andCsdqmcNotBetween(String value1, String value2) {
            addCriterion("csdqmc not between", value1, value2, "csdqmc");
            return (Criteria) this;
        }

        public Criteria andHkdzIsNull() {
            addCriterion("hkdz is null");
            return (Criteria) this;
        }

        public Criteria andHkdzIsNotNull() {
            addCriterion("hkdz is not null");
            return (Criteria) this;
        }

        public Criteria andHkdzEqualTo(String value) {
            addCriterion("hkdz =", value, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzNotEqualTo(String value) {
            addCriterion("hkdz <>", value, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzGreaterThan(String value) {
            addCriterion("hkdz >", value, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzGreaterThanOrEqualTo(String value) {
            addCriterion("hkdz >=", value, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzLessThan(String value) {
            addCriterion("hkdz <", value, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzLessThanOrEqualTo(String value) {
            addCriterion("hkdz <=", value, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzLike(String value) {
            addCriterion("hkdz like", value, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzNotLike(String value) {
            addCriterion("hkdz not like", value, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzIn(List<String> values) {
            addCriterion("hkdz in", values, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzNotIn(List<String> values) {
            addCriterion("hkdz not in", values, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzBetween(String value1, String value2) {
            addCriterion("hkdz between", value1, value2, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHkdzNotBetween(String value1, String value2) {
            addCriterion("hkdz not between", value1, value2, "hkdz");
            return (Criteria) this;
        }

        public Criteria andHksspcsIsNull() {
            addCriterion("hksspcs is null");
            return (Criteria) this;
        }

        public Criteria andHksspcsIsNotNull() {
            addCriterion("hksspcs is not null");
            return (Criteria) this;
        }

        public Criteria andHksspcsEqualTo(String value) {
            addCriterion("hksspcs =", value, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsNotEqualTo(String value) {
            addCriterion("hksspcs <>", value, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsGreaterThan(String value) {
            addCriterion("hksspcs >", value, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsGreaterThanOrEqualTo(String value) {
            addCriterion("hksspcs >=", value, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsLessThan(String value) {
            addCriterion("hksspcs <", value, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsLessThanOrEqualTo(String value) {
            addCriterion("hksspcs <=", value, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsLike(String value) {
            addCriterion("hksspcs like", value, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsNotLike(String value) {
            addCriterion("hksspcs not like", value, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsIn(List<String> values) {
            addCriterion("hksspcs in", values, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsNotIn(List<String> values) {
            addCriterion("hksspcs not in", values, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsBetween(String value1, String value2) {
            addCriterion("hksspcs between", value1, value2, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHksspcsNotBetween(String value1, String value2) {
            addCriterion("hksspcs not between", value1, value2, "hksspcs");
            return (Criteria) this;
        }

        public Criteria andHkszdqIsNull() {
            addCriterion("hkszdq is null");
            return (Criteria) this;
        }

        public Criteria andHkszdqIsNotNull() {
            addCriterion("hkszdq is not null");
            return (Criteria) this;
        }

        public Criteria andHkszdqEqualTo(String value) {
            addCriterion("hkszdq =", value, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqNotEqualTo(String value) {
            addCriterion("hkszdq <>", value, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqGreaterThan(String value) {
            addCriterion("hkszdq >", value, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqGreaterThanOrEqualTo(String value) {
            addCriterion("hkszdq >=", value, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqLessThan(String value) {
            addCriterion("hkszdq <", value, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqLessThanOrEqualTo(String value) {
            addCriterion("hkszdq <=", value, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqLike(String value) {
            addCriterion("hkszdq like", value, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqNotLike(String value) {
            addCriterion("hkszdq not like", value, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqIn(List<String> values) {
            addCriterion("hkszdq in", values, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqNotIn(List<String> values) {
            addCriterion("hkszdq not in", values, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqBetween(String value1, String value2) {
            addCriterion("hkszdq between", value1, value2, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqNotBetween(String value1, String value2) {
            addCriterion("hkszdq not between", value1, value2, "hkszdq");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcIsNull() {
            addCriterion("hkszdqmc is null");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcIsNotNull() {
            addCriterion("hkszdqmc is not null");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcEqualTo(String value) {
            addCriterion("hkszdqmc =", value, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcNotEqualTo(String value) {
            addCriterion("hkszdqmc <>", value, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcGreaterThan(String value) {
            addCriterion("hkszdqmc >", value, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcGreaterThanOrEqualTo(String value) {
            addCriterion("hkszdqmc >=", value, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcLessThan(String value) {
            addCriterion("hkszdqmc <", value, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcLessThanOrEqualTo(String value) {
            addCriterion("hkszdqmc <=", value, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcLike(String value) {
            addCriterion("hkszdqmc like", value, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcNotLike(String value) {
            addCriterion("hkszdqmc not like", value, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcIn(List<String> values) {
            addCriterion("hkszdqmc in", values, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcNotIn(List<String> values) {
            addCriterion("hkszdqmc not in", values, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcBetween(String value1, String value2) {
            addCriterion("hkszdqmc between", value1, value2, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andHkszdqmcNotBetween(String value1, String value2) {
            addCriterion("hkszdqmc not between", value1, value2, "hkszdqmc");
            return (Criteria) this;
        }

        public Criteria andJkzkdmIsNull() {
            addCriterion("jkzkdm is null");
            return (Criteria) this;
        }

        public Criteria andJkzkdmIsNotNull() {
            addCriterion("jkzkdm is not null");
            return (Criteria) this;
        }

        public Criteria andJkzkdmEqualTo(String value) {
            addCriterion("jkzkdm =", value, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmNotEqualTo(String value) {
            addCriterion("jkzkdm <>", value, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmGreaterThan(String value) {
            addCriterion("jkzkdm >", value, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmGreaterThanOrEqualTo(String value) {
            addCriterion("jkzkdm >=", value, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmLessThan(String value) {
            addCriterion("jkzkdm <", value, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmLessThanOrEqualTo(String value) {
            addCriterion("jkzkdm <=", value, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmLike(String value) {
            addCriterion("jkzkdm like", value, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmNotLike(String value) {
            addCriterion("jkzkdm not like", value, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmIn(List<String> values) {
            addCriterion("jkzkdm in", values, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmNotIn(List<String> values) {
            addCriterion("jkzkdm not in", values, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmBetween(String value1, String value2) {
            addCriterion("jkzkdm between", value1, value2, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkdmNotBetween(String value1, String value2) {
            addCriterion("jkzkdm not between", value1, value2, "jkzkdm");
            return (Criteria) this;
        }

        public Criteria andJkzkmcIsNull() {
            addCriterion("jkzkmc is null");
            return (Criteria) this;
        }

        public Criteria andJkzkmcIsNotNull() {
            addCriterion("jkzkmc is not null");
            return (Criteria) this;
        }

        public Criteria andJkzkmcEqualTo(String value) {
            addCriterion("jkzkmc =", value, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcNotEqualTo(String value) {
            addCriterion("jkzkmc <>", value, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcGreaterThan(String value) {
            addCriterion("jkzkmc >", value, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcGreaterThanOrEqualTo(String value) {
            addCriterion("jkzkmc >=", value, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcLessThan(String value) {
            addCriterion("jkzkmc <", value, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcLessThanOrEqualTo(String value) {
            addCriterion("jkzkmc <=", value, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcLike(String value) {
            addCriterion("jkzkmc like", value, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcNotLike(String value) {
            addCriterion("jkzkmc not like", value, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcIn(List<String> values) {
            addCriterion("jkzkmc in", values, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcNotIn(List<String> values) {
            addCriterion("jkzkmc not in", values, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcBetween(String value1, String value2) {
            addCriterion("jkzkmc between", value1, value2, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andJkzkmcNotBetween(String value1, String value2) {
            addCriterion("jkzkmc not between", value1, value2, "jkzkmc");
            return (Criteria) this;
        }

        public Criteria andZzdqIsNull() {
            addCriterion("zzdq is null");
            return (Criteria) this;
        }

        public Criteria andZzdqIsNotNull() {
            addCriterion("zzdq is not null");
            return (Criteria) this;
        }

        public Criteria andZzdqEqualTo(String value) {
            addCriterion("zzdq =", value, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqNotEqualTo(String value) {
            addCriterion("zzdq <>", value, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqGreaterThan(String value) {
            addCriterion("zzdq >", value, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqGreaterThanOrEqualTo(String value) {
            addCriterion("zzdq >=", value, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqLessThan(String value) {
            addCriterion("zzdq <", value, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqLessThanOrEqualTo(String value) {
            addCriterion("zzdq <=", value, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqLike(String value) {
            addCriterion("zzdq like", value, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqNotLike(String value) {
            addCriterion("zzdq not like", value, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqIn(List<String> values) {
            addCriterion("zzdq in", values, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqNotIn(List<String> values) {
            addCriterion("zzdq not in", values, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqBetween(String value1, String value2) {
            addCriterion("zzdq between", value1, value2, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqNotBetween(String value1, String value2) {
            addCriterion("zzdq not between", value1, value2, "zzdq");
            return (Criteria) this;
        }

        public Criteria andZzdqmcIsNull() {
            addCriterion("zzdqmc is null");
            return (Criteria) this;
        }

        public Criteria andZzdqmcIsNotNull() {
            addCriterion("zzdqmc is not null");
            return (Criteria) this;
        }

        public Criteria andZzdqmcEqualTo(String value) {
            addCriterion("zzdqmc =", value, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcNotEqualTo(String value) {
            addCriterion("zzdqmc <>", value, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcGreaterThan(String value) {
            addCriterion("zzdqmc >", value, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcGreaterThanOrEqualTo(String value) {
            addCriterion("zzdqmc >=", value, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcLessThan(String value) {
            addCriterion("zzdqmc <", value, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcLessThanOrEqualTo(String value) {
            addCriterion("zzdqmc <=", value, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcLike(String value) {
            addCriterion("zzdqmc like", value, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcNotLike(String value) {
            addCriterion("zzdqmc not like", value, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcIn(List<String> values) {
            addCriterion("zzdqmc in", values, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcNotIn(List<String> values) {
            addCriterion("zzdqmc not in", values, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcBetween(String value1, String value2) {
            addCriterion("zzdqmc between", value1, value2, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andZzdqmcNotBetween(String value1, String value2) {
            addCriterion("zzdqmc not between", value1, value2, "zzdqmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmIsNull() {
            addCriterion("jzdlxdm is null");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmIsNotNull() {
            addCriterion("jzdlxdm is not null");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmEqualTo(String value) {
            addCriterion("jzdlxdm =", value, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmNotEqualTo(String value) {
            addCriterion("jzdlxdm <>", value, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmGreaterThan(String value) {
            addCriterion("jzdlxdm >", value, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("jzdlxdm >=", value, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmLessThan(String value) {
            addCriterion("jzdlxdm <", value, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmLessThanOrEqualTo(String value) {
            addCriterion("jzdlxdm <=", value, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmLike(String value) {
            addCriterion("jzdlxdm like", value, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmNotLike(String value) {
            addCriterion("jzdlxdm not like", value, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmIn(List<String> values) {
            addCriterion("jzdlxdm in", values, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmNotIn(List<String> values) {
            addCriterion("jzdlxdm not in", values, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmBetween(String value1, String value2) {
            addCriterion("jzdlxdm between", value1, value2, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxdmNotBetween(String value1, String value2) {
            addCriterion("jzdlxdm not between", value1, value2, "jzdlxdm");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcIsNull() {
            addCriterion("jzdlxmc is null");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcIsNotNull() {
            addCriterion("jzdlxmc is not null");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcEqualTo(String value) {
            addCriterion("jzdlxmc =", value, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcNotEqualTo(String value) {
            addCriterion("jzdlxmc <>", value, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcGreaterThan(String value) {
            addCriterion("jzdlxmc >", value, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcGreaterThanOrEqualTo(String value) {
            addCriterion("jzdlxmc >=", value, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcLessThan(String value) {
            addCriterion("jzdlxmc <", value, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcLessThanOrEqualTo(String value) {
            addCriterion("jzdlxmc <=", value, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcLike(String value) {
            addCriterion("jzdlxmc like", value, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcNotLike(String value) {
            addCriterion("jzdlxmc not like", value, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcIn(List<String> values) {
            addCriterion("jzdlxmc in", values, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcNotIn(List<String> values) {
            addCriterion("jzdlxmc not in", values, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcBetween(String value1, String value2) {
            addCriterion("jzdlxmc between", value1, value2, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andJzdlxmcNotBetween(String value1, String value2) {
            addCriterion("jzdlxmc not between", value1, value2, "jzdlxmc");
            return (Criteria) this;
        }

        public Criteria andSfdsznIsNull() {
            addCriterion("sfdszn is null");
            return (Criteria) this;
        }

        public Criteria andSfdsznIsNotNull() {
            addCriterion("sfdszn is not null");
            return (Criteria) this;
        }

        public Criteria andSfdsznEqualTo(String value) {
            addCriterion("sfdszn =", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznNotEqualTo(String value) {
            addCriterion("sfdszn <>", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznGreaterThan(String value) {
            addCriterion("sfdszn >", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznGreaterThanOrEqualTo(String value) {
            addCriterion("sfdszn >=", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznLessThan(String value) {
            addCriterion("sfdszn <", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznLessThanOrEqualTo(String value) {
            addCriterion("sfdszn <=", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznLike(String value) {
            addCriterion("sfdszn like", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznNotLike(String value) {
            addCriterion("sfdszn not like", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznIn(List<String> values) {
            addCriterion("sfdszn in", values, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznNotIn(List<String> values) {
            addCriterion("sfdszn not in", values, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznBetween(String value1, String value2) {
            addCriterion("sfdszn between", value1, value2, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznNotBetween(String value1, String value2) {
            addCriterion("sfdszn not between", value1, value2, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andDeltagIsNull() {
            addCriterion("deltag is null");
            return (Criteria) this;
        }

        public Criteria andDeltagIsNotNull() {
            addCriterion("deltag is not null");
            return (Criteria) this;
        }

        public Criteria andDeltagEqualTo(Boolean value) {
            addCriterion("deltag =", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotEqualTo(Boolean value) {
            addCriterion("deltag <>", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagGreaterThan(Boolean value) {
            addCriterion("deltag >", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deltag >=", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagLessThan(Boolean value) {
            addCriterion("deltag <", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagLessThanOrEqualTo(Boolean value) {
            addCriterion("deltag <=", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagIn(List<Boolean> values) {
            addCriterion("deltag in", values, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotIn(List<Boolean> values) {
            addCriterion("deltag not in", values, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagBetween(Boolean value1, Boolean value2) {
            addCriterion("deltag between", value1, value2, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deltag not between", value1, value2, "deltag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}