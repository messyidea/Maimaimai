create table `rootcat`(
`id` int(10) primary key,
`name` varchar(20),
`count` int(10)
);

create table `soncat`(
`id` int(10) primary key,
`name` varchar(20),
`fa` int(10)
);
