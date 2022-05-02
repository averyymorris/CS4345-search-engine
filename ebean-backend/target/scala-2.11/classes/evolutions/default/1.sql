# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table article (
  article_id                    integer auto_increment not null,
  article_title                 varchar(255),
  article_abstract              varchar(255),
  constraint pk_article primary key (article_id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists article;

drop table if exists user;

