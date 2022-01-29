package com.todo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
    public class Todo {
        public Todo(int id, String title, String description) {
            this.id = id;
            this.title = title;
            this.description = description;
        }
        @Id
        private  int id ;
        private  String title ;
        private String description ;

    public Todo() {

    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

