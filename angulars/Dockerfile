### STAGE 1: Build ###
FROM node:14.15-alpine AS build
WORKDIR /usr/src/app
COPY package.json ./
RUN npm install
COPY . .
RUN npm run build

### STAGE 2: Run ###
FROM nginx:1.14-alpine
COPY default.conf /etc/nginx/conf.d/default.conf
COPY --from=build /usr/src/app/dist/InviteMe /usr/share/nginx/html
EXPOSE 4200